

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// AWT

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    public static JPanel cellsButtons;

    private Map map;

    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(WIN_POSX, WIN_POSY);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("Tic Tac Toe");
        setResizable(false);
        // Settings(GameWindow mainWindow) {
        Settings settings = new Settings(this);
        map = new Map();
        // layout
        JButton btnStart = new JButton("Start");
        JButton btnExit = new JButton("Exit");
        // action handler
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JPanel panelButtons = new JPanel(new GridLayout(1, 2));
        panelButtons.add(btnStart);
        panelButtons.add(btnExit);

        add(map);
        add(panelButtons, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void acceptSettings(int mode, int fieldSizeX, int fieldSizeY, int winLen) {
        if (cellsButtons != null){
            remove(cellsButtons);
            revalidate();
        }
        map.startNewGame(mode, fieldSizeX, fieldSizeY, winLen);
        JButton[][] cells = new JButton[fieldSizeX][fieldSizeY];
        cellsButtons = new JPanel(new GridLayout(fieldSizeX, fieldSizeY));
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new JButton("");
                cellsButtons.add(cells[i][j]);
                cellsButtons.revalidate();
            }
        }
        add(cellsButtons, BorderLayout.CENTER);
        revalidate();
        setVisible(true);

    }

}