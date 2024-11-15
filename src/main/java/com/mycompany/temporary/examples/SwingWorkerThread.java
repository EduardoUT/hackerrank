/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.temporary.examples;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author eduar
 */
public class SwingWorkerThread {

    private final JProgressBar progressBar;

    public SwingWorkerThread(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public SwingWorker<Void, Integer> getSW() {
        return new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i < 100; i++) {
                    publish(i); // Envía el progreso

                    Thread.sleep(500); // Simula una tarea larga
                }
                return null;
            }

            @Override
            protected void process(List<Integer> chunks) {
                int latestProgress = chunks.get(chunks.size() - 1);
                progressBar.setValue(latestProgress); // Actualiza la barra de progreso
            }

            @Override
            protected void done() {
                progressBar.setValue(100);
                System.out.println("Tarea finalizada");
            }
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JProgressBar progressBar1 = new JProgressBar(0, 100); // Rango de 0 a 10
            progressBar1.setStringPainted(true);
            JFrame frame = new JFrame("Ejemplo de SwingWorker con Progress Bar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(progressBar1);
            frame.pack();
            frame.setVisible(true);
            SwingWorkerThread worker = new SwingWorkerThread(progressBar1);
            worker.getSW().execute();
        });
    }

}
