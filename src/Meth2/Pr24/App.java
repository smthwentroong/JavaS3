package Meth2.Pr24;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class App extends JFrame{
    Document currentDocument;
    CreateDocument fabricDocument;

    public App(){
        super("Document Manager");
        setSize(600,600);

        fabricDocument = new CreateTextDocument();
        currentDocument = fabricDocument.CreateNew("Dir1", "Document1", 100);

        JTextArea textArea = new JTextArea();

        add(textArea);

        JMenuBar menuBarMain = new JMenuBar();
        menuBarMain.setBackground(Color.WHITE);

        JMenu menuFile = new JMenu("File");

        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");

        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemExit);

        menuBarMain.add(menuFile);
        setJMenuBar(menuBarMain);

        itemNew.addActionListener(e -> {
            textArea.setText("");
            String stDocumentName = JOptionPane.showInputDialog("Введите название документа");
            if (stDocumentName == null) return;
            String stDocumentFolder = JOptionPane.showInputDialog("Введите директорию в которой находится документ");
            if (stDocumentFolder == null) return;

            currentDocument = fabricDocument.CreateNew(stDocumentFolder, stDocumentName, new Random().nextInt(1,100));
        });

        itemOpen.addActionListener(e ->{
            String documentName = JOptionPane.showInputDialog("Введите название документа");
            if(documentName == null) return;

            currentDocument = fabricDocument.CreateOpen(documentName);
            textArea.setText(currentDocument.getContent());
        });

        itemSave.addActionListener( e -> {
            JOptionPane.showMessageDialog(getContentPane(), "Сохранено");
            currentDocument.setContent(textArea.getText().toString());
        });

        itemExit.addActionListener(e->{
            this.dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}