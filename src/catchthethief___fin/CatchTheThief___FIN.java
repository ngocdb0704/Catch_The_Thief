/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catchthethief___fin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author NgocDinh
 */
class mapPanel extends JPanel{
    ImageIcon imaPol = new ImageIcon("policeLogo.jpg");
    ImageIcon imaCir = new ImageIcon("blue-circle.png");
    ImageIcon imaThi = new ImageIcon("akali.jpg");
    ImageIcon polRun = new ImageIcon("polRun.png");
    ImageIcon kunaiRight = new ImageIcon("kunai_right.png");
    ImageIcon kunaiLeft = new ImageIcon("kunai_left.png");
    ImageIcon shuriken = new ImageIcon("shuriken.png");
    ImageIcon kunaiUpRight = new ImageIcon("kunai_upright.png");
    ImageIcon kunaiUpLeft = new ImageIcon("kunai_upleft.png");
    public mapPanel() throws FileNotFoundException {
        inMap();
    }
    private void inMap() throws FileNotFoundException{
        setSize(new Dimension(750, 600));
        setLayout(null);
        setBackground(new Color(0xCCFFFF));
        serialAddPos();
        addMouseActionToLabel();
        setVisible(true);
        loadGraphData();
        thief = pos9;
    }
    private void addPos(javax.swing.JLabel nJL, int n, int x, int y){
        switch(n)
        {
            case 1:
            {
                nJL.setIcon(imaPol);
                break;
            }
            case 2:
            {
                nJL.setIcon(imaCir);
                break;
            }
            case 3:
            {
                nJL.setIcon(imaThi);
                break;
            }
        }
        nJL.setSize(50, 50);
        nJL.setLocation(x, y);
        add(nJL);
    }
    private void serialAddPos(){
        pos0 = new JLabel();pos1 = new JLabel();pos2 = new JLabel();
        pos3 = new JLabel();pos4 = new JLabel();pos5 = new JLabel();
        pos6 = new JLabel();pos7 = new JLabel();pos8 = new JLabel();
        pos9 = new JLabel();
        pos0.setName("0"); pos1.setName("1");pos2.setName("2");
        pos3.setName("3");pos4.setName("4");pos5.setName("5");
        pos6.setName("6");pos7.setName("7");pos8.setName("8");
        pos9.setName("9");
        pos0.setIconTextGap(1);pos1.setIconTextGap(1);pos2.setIconTextGap(1);
        pos9.setIconTextGap(2);
        addPos(pos0, 1, 150, 430);addPos(pos1, 1, 350, 430);
        addPos(pos2, 1, 550, 430);addPos(pos3, 2, 150, 310);
        addPos(pos4, 2, 350, 310);addPos(pos5, 2, 550, 310);
        addPos(pos6, 2, 150, 190);addPos(pos7, 2, 350, 190);
        addPos(pos8, 2, 550, 190);addPos(pos9, 3, 350, 70);
        jL.add(pos0);jL.add(pos1);jL.add(pos2);jL.add(pos3);jL.add(pos4);
        jL.add(pos5);jL.add(pos6);jL.add(pos7);jL.add(pos8);jL.add(pos9);
    }
    private void addMouseActionToLabel(){
        pos0.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos0);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos0, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos0.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos0, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        pos1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos1);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos1);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos1, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos1.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos1, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        pos2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos2);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos2, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos2.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos2, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos3);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos3);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos3, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos3.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos3, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos4);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos4);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos4, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos4.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos4, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos5);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos5);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos5, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        pos5.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos5, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos6);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos6);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos6, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos6.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos6, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos7);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos7);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos7, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos7.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos7, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos8.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos8);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos8);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos8, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos8.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos8, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        }); 
        pos9.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                runIcon(pos9);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                runIcon(pos9);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getBack(pos9, e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); 
        pos9.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                polPath(pos9, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
    }
    private void updatePolPos(JLabel src, JLabel des, int x, int y){
        if(des.getIconTextGap() == 4){
            src.setLocation(x, y);
            src.setIcon(imaCir);
            des.setIcon(imaPol);
            src.setIconTextGap(4);
            des.setIconTextGap(1);
        }
    }
    private boolean checkPos(int des, int x, int y){
        boolean b = false;
        switch(des)
        {
            case 0:
            {
                b = (x <= 160 && x >= 140 && y >= 420 && y <= 440);
                break;
            }
            case 1:
            {
                b = (x <= 360 && x >= 340 && y >= 420 && y <= 440);
                break;
            }
            case 2:
            {
                b = (x <= 560 && x >= 540 && y >= 420 && y <= 440);
                break;
            }
            case 3:
            {
                b = (x <= 160 && x >= 140 && y >= 300 && y <= 320);
                break;
            }
            case 4:
            {
                b = (x <= 360 && x >= 340 && y >= 300 && y <= 320);
                break;
            }
            case 5:
            {
                b = (x <= 560 && x >= 540 && y >= 300 && y <= 320);
                break;
            }
            case 6:
            {
                b =(x <= 160 && x >= 140 && y >= 180 && y <= 200);
                break;
            }
            case 7:
            {
                b =(x <= 360 && x >= 340 && y >= 180 && y <= 200);
                break;
            }
            case 8:
            {
                b =(x <= 560 && x >= 540 && y >= 180 && y <= 200);
                break;
            }
            case 9:
            {
                b = (x <= 360 && x >= 340 && y >= 60 && y <= 80);
                break;
            }
            default:
            {
                break;
            }
        }
        return b;
    }
    private void runIcon(JLabel j){
        if(j.getIconTextGap()==1) j.setIcon(polRun);
    }
    public void getBack(JLabel j, MouseEvent e) {
                int posX = e.getX();
                int posY = e.getY();
                switch (j.getName())
                {
                    case "0":
                    {
                        if(posX != 150 || posY !=430) j.setLocation(150, 430);
                        break;
                    }
                    case "1":
                    {
                        if(posX != 350 || posY !=430) j.setLocation(350, 430);
                        break;
                    }
                    case "2":
                    {
                        if(posX != 550 || posY !=430) j.setLocation(550, 430);
                        break;
                    }
                    case "3":
                    {
                        if(posX != 150 || posY != 310) j.setLocation(150, 310);
                        break;
                    }
                    case "4":
                    {
                        if(posX != 350 || posY != 310) j.setLocation(350, 310);
                        break;
                    }
                    case "5":
                    {
                        if(posX != 550 || posY != 310) j.setLocation(550, 310);
                        break;
                    }
                    case "6":
                    {
                        if(posX != 150 || posY != 190) j.setLocation(150, 190);
                        break;
                    }
                    case "7":
                    {
                        if(posX != 350 || posY != 190) j.setLocation(350, 190);
                        break;
                    }
                    case "8":
                    {
                        if(posX != 550 || posY != 190) j.setLocation(550, 190);
                        break;
                    }
                    case "9":
                    {
                        if(posX != 350 || posY != 70) j.setLocation(350, 70);
                        break;
                    }
                }
                if(j.getIconTextGap()==1) j.setIcon(imaPol);
            }
    private void polPath(JLabel j, MouseEvent e){
        int[] getOut={0};
        if(j.getIconTextGap() == 1){
            int mouseX = e.getXOnScreen() - j.getWidth()-575;
            int mouseY = e.getYOnScreen()-  j.getHeight()-250;
            j.setLocation(mouseX, mouseY);
            int num = Integer.parseInt(j.getName());
            ArrayList<JLabel> list = adjLabel.get(num);
            list.forEach((t) -> {
                if(t.getIconTextGap() == 4){
                    int pos = Integer.parseInt(t.getName());
                if(checkPos(pos, mouseX, mouseY)){
                switch (num)
                    {
                        case 0:
                            {
                                updatePolPos(j, t, 150, 430);
                                break;
                            }
                        case 1:
                        {
                            updatePolPos(j, t, 350, 430);
                            break;
                        }
                        case 2:
                        {
                            updatePolPos(j, t, 550, 430);
                            break;
                        }
                        case 3:
                        {
                            updatePolPos(j, t, 150, 310);
                            break;
                        }
                        case 4:
                        {
                            updatePolPos(j, t, 350, 310);
                            break;
                        }
                        case 5:
                        {
                            updatePolPos(j, t, 550, 310);
                            break;
                        }
                        case 6:
                        {
                            updatePolPos(j, t, 150, 190);
                            break;
                        }
                        case 7:
                        {
                            updatePolPos(j, t, 350, 190);
                            break;
                        }
                        case 8:
                        {
                            updatePolPos(j, t, 550, 190);
                            break;
                        }
                        case 9:
                        {
                            updatePolPos(j, t, 350, 70);
                            break;
                        }
                    }
                    getOut[0] = 1;
                }
                }
            }); 
            if(getOut[0]==1) runThiefRun();
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        g.drawLine(375, 335, 175, 455);
        g.drawLine(375, 335, 175, 335);
        g.drawLine(375, 335, 175, 215);
        g.drawLine(375, 335, 575, 455);
        g.drawLine(375, 335, 575, 335);
        g.drawLine(375, 335, 575, 215);
        g.drawLine(375, 335, 375, 455);
        g.drawLine(375, 335, 375, 215);
        g.drawLine(375, 455, 175, 455);
        g.drawLine(375, 455, 575, 455);
        g.drawLine(375, 215, 175, 215);
        g.drawLine(375, 215, 575, 215);
        g.drawLine(375, 95, 175, 215);
        g.drawLine(375, 95, 575, 215);
        g.drawLine(375, 95, 375, 215);
        g.drawLine(175, 335, 175, 215);
        g.drawLine(175, 335, 175, 455);
        g.drawLine(575, 335, 575, 215);
        g.drawLine(575, 335, 575, 455);
    }
    private void loadGraphData() throws FileNotFoundException{
        File nF = new File("graph_data.txt");
        Scanner  sc = new Scanner(nF);
        int i=0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] splitLine = line.split(" ");
            ArrayList<JLabel> arList = new ArrayList<>();
            for(int j=0; j<splitLine.length; j++){
                if(splitLine[j].equals("1")) arList.add(jL.get(j));
            }
            adjLabel.add(arList);
            i++;
        }
    }
    private ArrayList<JLabel> thiefPossiblePath(){
        int num = Integer.parseInt(thief.getName());
        ArrayList<JLabel> posPath = new ArrayList<>();
        adjLabel.get(num).forEach((t) -> {
            if(t.getIconTextGap() == 4) posPath.add(t);
        });
        return posPath;
    }
    private void runThiefRun(){
        JLabel[] bestPath = new JLabel[3];
        int[] shortest = {8};
        JLabel[] key = {thief};
        ArrayList<JLabel> posPath = thiefPossiblePath();
        if(posPath.isEmpty()){
            JOptionPane.showMessageDialog(this, "You win!");
            setVisible(false);
        }
        else{
            JLabel[] truePath = {posPath.get(0)};
            HashMap<Integer, JLabel> solution = djikstra(thief);
            solution.forEach((t, u) -> {
                if(!u.getName().equals(thief.getName())){
                    if(t<shortest[0]){
                        shortest[0] = t;
                        key[0] = u;
                    }
                }
            }); 
            if(!key[0].getName().equals(thief.getName()) && shortest[0]!=8){
                truePath[0] = key[0];
            }
            new Thread(runAnimation(thief, truePath[0])).start();
            
        }
    }
    private HashMap<Integer, JLabel> djikstra(JLabel src){
        HashMap<Integer, JLabel> solution = new HashMap<>();
        String fin = "012";
        int n = jL.size();
        int numSrc = Integer.parseInt(src.getName());
        int min = 9;
        int[] dist = new int[n];
        JLabel[] prev = new JLabel[n];
        ArrayList<JLabel> q = new ArrayList<>();
        ArrayList<JLabel> list = new ArrayList<>();
        int i, num, thatDist;
        for(i=0; i<n; i++){
            dist[i] = min;
            prev[i] = null;
            q.add(jL.get(i));
        }
        dist[numSrc] = 0;
        while(!q.isEmpty()){
            int pos=0;
            int qmin=10;
            for(i=0; i<q.size(); i++){
                int posMin = Integer.parseInt(q.get(i).getName());
                if(dist[posMin]<qmin){
                    qmin = posMin;
                    pos = i;
                }
            }
            JLabel u = q.get(pos);
            q.remove(pos);
            num = Integer.parseInt(u.getName());
            list = adjLabel.get(num);
            for(i=0; i<list.size(); i++){
                int adjNum = Integer.parseInt(list.get(i).getName());
                thatDist = dist[num] + 1;
                if(thatDist<dist[adjNum] && jL.get(adjNum).getIconTextGap() == 4){
                    dist[adjNum] = thatDist;
                    prev[adjNum] = u;
                }
            }
        }
        JLabel possiPos0 = possiblePath(src, pos0, dist, prev);
        JLabel possiPos1 = possiblePath(src, pos1, dist, prev);
        JLabel possiPos2 = possiblePath(src, pos2, dist, prev);
        solution.put(dist[0], possiPos0);
        solution.put(dist[1], possiPos1);
        solution.put(dist[2], possiPos2);
        return solution;
    }
    private JLabel possiblePath(JLabel src, JLabel des, int[] dist, JLabel[] prev){
        ArrayList<JLabel> resArr = new ArrayList<>();
        int desNum = Integer.parseInt(des.getName());;
        JLabel next;
        if(dist[desNum] != 9 && dist[desNum] != 1){
            while(des!=src){
                desNum = Integer.parseInt(des.getName());
                next = prev[desNum];
                resArr.add(next);
                des = next;
            }
            return resArr.get(resArr.size()-2);
        }
        else return src;
    }
    private Runnable runAnimation(JLabel src, JLabel des){
        src.setIconTextGap(4);
        src.setIcon(imaCir);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                srcToDes(src, des);
            }
        };
        return runnable;
    }
    private void srcToDes(JLabel src, JLabel des){
        JLabel movingTarget = new JLabel();
        movingTarget.setIcon(imaThi);
        movingTarget.setSize(50, 50);
        movingTarget.setLocation(src.getX(), src.getY());
        movingTarget.setVisible(true);
        add(movingTarget);
        JLabel move = new JLabel();
        move.setSize(40, 40);
        move.setLocation(src.getX(), src.getY());
        move.setVisible(true);
        add(move);
        String direction = "";
        int x, y, m, n;
        boolean b1=false;
        boolean b2=false;
        int getOut=0;
        int bound = 0;
        int count=0;
        Random ran = new Random();
        int sound = ran.nextInt(2);
        playThiefMove(sound);
        if((src.equals(pos9) && des.equals(pos8)) 
                ||(src.equals(pos4) && des.equals(pos2))
                ||(src.equals(pos6) && des.equals(pos4))){
            bound = des.getX();
            move.setIcon(kunaiRight);
            direction="downright";
        }
        else if ((src.equals(pos9) && des.equals(pos6)) 
                ||(src.equals(pos4) && des.equals(pos0))
                ||(src.equals(pos8) && des.equals(pos4))){
            bound = des.getX();
            move.setIcon(kunaiLeft);
            direction="downleft";
        }
        else if ((src.equals(pos9) && des.equals(pos7))
                ||(src.equals(pos4) && des.equals(pos1))
                ||(src.equals(pos6) && des.equals(pos3))
                ||(src.equals(pos3) && des.equals(pos0))
                ||(src.equals(pos7) && des.equals(pos4))
                ||(src.equals(pos8) && des.equals(pos5))
                ||(src.equals(pos5) && des.equals(pos2))){
            direction="down";
            bound = des.getY();
            move.setIcon(shuriken);
        }
        else if((src.equals(pos4) && des.equals(pos7))
                ||(src.equals(pos7) && des.equals(pos9))
                ||(src.equals(pos3) && des.equals(pos6))
                ||(src.equals(pos5) && des.equals(pos8))){
            direction="up";
            bound = des.getY();
            move.setIcon(shuriken);
        }
        else if((src.equals(pos4) && des.equals(pos5))
                || (src.equals(pos7) && des.equals(pos8))
                || (src.equals(pos6) && des.equals(pos7))
                || (src.equals(pos3) && des.equals(pos4))){
            direction="right";
            bound = des.getX();
            move.setIcon(shuriken);
        }
        else if((src.equals(pos8) && des.equals(pos7))
                ||(src.equals(pos5) && des.equals(pos4))
                ||(src.equals(pos7) && des.equals(pos6))
                ||(src.equals(pos4) && des.equals(pos3))){
            direction="left";
            bound = des.getX();
            move.setIcon(shuriken);
        }
        else if((src.equals(pos6) && des.equals(pos9))
                ||(src.equals(pos4) && des.equals(pos8))){
            direction="upright";
            bound = des.getX();
            move.setIcon(kunaiUpRight);
        }
        else if((src.equals(pos8) && des.equals(pos9))
                ||(src.equals(pos4) && des.equals(pos6))){
            direction="upleft";
            bound = des.getX();
            move.setIcon(kunaiUpLeft);
        }
        while(getOut==0){
            serialDisable();
            if(direction.contains("right")){
                x = move.getX() + 15;
                m = movingTarget.getX() -10;
            }
            else if (direction.contains("left")){
                x = move.getX() - 15;
                m = movingTarget.getX() +10;
            }
            else {
                x = move.getX();
                m = movingTarget.getX();
            }
            if(direction.contains("up")){
                y = move.getY()-9;
                n = movingTarget.getY()+6;
            }
            else if(direction.contains("down")){
                y = move.getY() + 9;
                n = movingTarget.getY() -6;
            }
            else{
                y = move.getY();
                n = movingTarget.getY();
            }
            try{ Thread.sleep(40); }
            catch(InterruptedException e){}
            if(direction.contains("right")) b1 = x>= bound;
            else if(direction.contains("left")) b1 = x<=bound;
            else if(direction.equals("up")) b1 = y<=bound;
            else if(direction.equals("down")) b1 = y>=bound;
            if(b1){
                getOut=1;
                while(getOut==1){
                    count++;
                    if(direction.contains("right")) m = movingTarget.getX() +15;
                    else if (direction.contains("left")) m = movingTarget.getX() -15;
                    else m = movingTarget.getX();
                    if(direction.contains("up")) n = movingTarget.getY()-9;
                    else if(direction.contains("down")) n = movingTarget.getY() +9;
                    else n = movingTarget.getY();
                    
                    try{ Thread.sleep(30); }
                    catch(InterruptedException e){ }
                    
                    if(direction.contains("right")) b2 = m>= bound;
                    else if(direction.contains("left")) b2 = m<=bound;
                    else if(direction.equals("up")) b2 = n<=bound;
                    else if(direction.equals("down")) b2 = n>=bound;
                    if(b2){
                        getOut=2;
                        serialEnable();
                        movingTarget.setVisible(false);
                        move.setVisible(false);
                        remove(movingTarget);
                        remove(move);
                        des.setIconTextGap(2);
                        des.setIcon(imaThi);
                        thief = des;
                    }
                    else{
                        movingTarget.setLocation(m, n);
                    }
                }
            }
            else{
                movingTarget.setLocation(m, n);
                move.setLocation(x, y);
            }
        }
        if(thief.equals(pos0) || thief.equals(pos1) || thief.equals(pos2)){
            JOptionPane.showMessageDialog(this, "Game over!");
            setVisible(false);
        }
    }
    private void serialDisable(){
        jL.forEach((t) -> {
            if(t.getIconTextGap() == 1) t.setIconTextGap(6);
        }); 
    }
    private void serialEnable(){
        jL.forEach((t) -> {
            if(t.getIconTextGap() == 6)  t.setIconTextGap(1);
        }); 
    }
    private void playThiefMove(int i){
        File thi1 = new File("thi1.wav");
        File thi2 = new File("thi2.wav");
        File thi3 = new File("thi3.wav");
        File[] fileList ={thi1, thi2, thi3};
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(fileList[i]);
        } catch (UnsupportedAudioFileException ex) {
        } catch (IOException ex) {
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException ex) {
        } catch (IOException ex) {
        }
        clip.start();
    }
    private ArrayList<JLabel> jL = new ArrayList<>();
    private ArrayList<ArrayList<JLabel>> adjLabel = new ArrayList<>();
    private JLabel thief = new JLabel();
    private javax.swing.JLabel pos0;
    private javax.swing.JLabel pos1;
    private javax.swing.JLabel pos2;
    private javax.swing.JLabel pos3;
    private javax.swing.JLabel pos4;
    private javax.swing.JLabel pos5;
    private javax.swing.JLabel pos6;
    private javax.swing.JLabel pos7;
    private javax.swing.JLabel pos8;
    private javax.swing.JLabel pos9;
}
class mainFrame extends JFrame{
    public mainFrame() throws FileNotFoundException {
        inComp();
    }
    private void inComp() throws FileNotFoundException{
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(new Point(600, 250));
        setBounds(600, 250, 750, 600);
        mapPanel pan = new mapPanel();
        add(pan, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 750, 600));
        revalidate();
        setResizable(false);
        setVisible(true);
        playBackGroundMusic();
    }
    private void playBackGroundMusic(){
        File nF = new File("Fluffing-a-Duck(chosic.com).wav");
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(nF);
        } catch (UnsupportedAudioFileException | IOException ex) {
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException | IOException ex) {
        }
        while(!clip.isRunning()) clip.start();
    } 
}
public class CatchTheThief___FIN {
    public static void main(String[] args) throws FileNotFoundException {
        mainFrame mF = new mainFrame();
    }
}
