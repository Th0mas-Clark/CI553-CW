package clients.Advert;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Adverts {

    static int height = 300;
    static int width = 400;
    private static int currentImageIndex = 0;
    private static final String[] imageFiles = {
            "images/pic0001.jpg", "images/pic0002.jpg", "images/pic0003.jpg",
            "images/pic0004.jpg", "images/pic0005.jpg", "images/pic0006.jpg", "images/pic0007.jpg"
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        Timer timer = new Timer(5000, e -> changeImage(label));
        timer.start();

        label.setPreferredSize(new Dimension(width, height));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void changeImage(JLabel label) {
        File file = new File(imageFiles[currentImageIndex]);
        BufferedImage img = null;

        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        if (img != null) {
            label.setIcon(new ImageIcon(img));
        }

        currentImageIndex = (currentImageIndex + 1) % imageFiles.length;
    }
}
