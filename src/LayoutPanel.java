import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Color;

public class LayoutPanel extends JPanel
{
    private JProgressBar progressBar;
    private Timer timer;
    private DecimalFormat formato;

    ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imagenes/auto.png"));
    JLabel label_mov = new JLabel(imagen1);
    ImageIcon imagen2 = new ImageIcon(getClass().getResource("/imagenes/harina.png"));
    JLabel label_mov2 = new JLabel(imagen2);
    ImageIcon imagen3 = new ImageIcon(getClass().getResource("/imagenes/galleta.png"));
    JLabel label_mov3 = new JLabel(imagen3);
    ImageIcon imagen4 = new ImageIcon(getClass().getResource("/imagenes/div_galleta.png"));
    JLabel label_mov4 = new JLabel(imagen4);
    ImageIcon imagen5 = new ImageIcon(getClass().getResource("/imagenes/galleta_chocolate.png"));
    JLabel label_mov5 = new JLabel(imagen5);
    ImageIcon imagen6 = new ImageIcon(getClass().getResource("/imagenes/galleta_cocida.png"));
    JLabel label_mov6 = new JLabel(imagen6);
    ImageIcon imagen7 = new ImageIcon(getClass().getResource("/imagenes/chocolate.png"));
    JLabel label_mov7 = new JLabel(imagen7);
    ImageIcon imagen8 = new ImageIcon(getClass().getResource("/imagenes/paquete.png"));
    JLabel label_mov8 = new JLabel(imagen8);

    private int[] mov = {810, 410}; // posicion del auto
    private int[] mov2 = {15, 35}; //posicion de la harina
    private int[] mov3 = {365, 45}; // posicion de la galleta
    private int[] mov4 = {455, 110}; // posicion de la división galleta
    private int[] mov5 = {550, 220}; // posicion de la galleta de chocolate
    private int[] mov6 = {710, 130}; // posicion de la galleta cocida
    private int[] mov7 = {235, 370}; // posicion del chocolate
    private int[] mov8 = {812, 100}; // posicion de la galleta empaquetada
    
    public LayoutPanel(){
        setLayout(null);
        setBackground(new Color(249, 249, 191));

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(10, 5, 980, 20);
        add(progressBar);

        // Entidades
        label_mov.setBounds(mov[0], mov[1], 100, 100);
        add(label_mov);

        label_mov2.setBounds(mov2[0], mov2[1], 40, 40);
        add(label_mov2);

        label_mov3.setBounds(mov3[0], mov3[1], 40, 40);
        add(label_mov3); label_mov3.setVisible(false);
               
        label_mov4.setBounds(mov4[0], mov4[1], 40, 40);
        add(label_mov4); label_mov4.setVisible(false);
                
        label_mov5.setBounds(mov5[0], mov5[1], 40, 40);
        add(label_mov5); label_mov5.setVisible(false);
                
        label_mov6.setBounds(mov6[0], mov6[1], 40, 40);
        add(label_mov6); label_mov6.setVisible(false);

        label_mov7.setBounds(mov7[0], mov7[1], 40, 40);
        add(label_mov7);

        label_mov8.setBounds(mov8[0], mov8[1], 40, 40);
        add(label_mov8);

        // Locaciones

        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/imagenes/bodega.png"));
        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/imagenes/banda_amasadora.png"));
        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/imagenes/batidora.png"));
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/imagenes/banda_cortadora.png"));
        ImageIcon imagen13 = new ImageIcon(getClass().getResource("/imagenes/cortadora.png"));
        ImageIcon imagen14 = new ImageIcon(getClass().getResource("/imagenes/banda_galletas.png"));
        ImageIcon imagen15 = new ImageIcon(getClass().getResource("/imagenes/maquina_chocolate.png"));
        ImageIcon imagen16 = new ImageIcon(getClass().getResource("/imagenes/banda_chocolate.png"));

        ImageIcon imagen17 = new ImageIcon(getClass().getResource("/imagenes/mesa.png"));
        ImageIcon imagen18 = new ImageIcon(getClass().getResource("/imagenes/banda_horneado.png"));
        ImageIcon imagen19 = new ImageIcon(getClass().getResource("/imagenes/horno.png"));
        ImageIcon imagen20 = new ImageIcon(getClass().getResource("/imagenes/banda_empaquetado.png"));
        ImageIcon imagen21 = new ImageIcon(getClass().getResource("/imagenes/empaquetadora.png"));
        ImageIcon imagen22 = new ImageIcon(getClass().getResource("/imagenes/banda_transporte.png"));
        ImageIcon imagen23 = new ImageIcon(getClass().getResource("/imagenes/cargador.png"));
        ImageIcon imagen24 = new ImageIcon(getClass().getResource("/imagenes/carretera.png"));
        ImageIcon imagen25 = new ImageIcon(getClass().getResource("/imagenes/mercado.png"));

	    JLabel label9 = new JLabel(imagen9);
	    label9.setBounds(10,35,100,100);
        add(label9);
	    JLabel label10 = new JLabel(imagen10);
        label10.setBounds(120,35,110,100);
        add(label10);
	    JLabel label11 = new JLabel(imagen11);
        label11.setBounds(240,35,100,100);
        add(label11);
	    JLabel label12 = new JLabel(imagen12);
        label12.setBounds(360,35,130,100);
        add(label12);
        JLabel label13 = new JLabel(imagen13);
        label13.setBounds(500,55,100,100);
        add(label13);
	    JLabel label14 = new JLabel(imagen14);
        label14.setBounds(450,105,130,190);
        add(label14);
	    JLabel label15 = new JLabel(imagen15);
        label15.setBounds(230,270,100,100);
        add(label15);
	    JLabel label16 = new JLabel(imagen16);
        label16.setBounds(340,225,100,100);
        add(label16);
	    JLabel label17 = new JLabel(imagen17);
        label17.setBounds(440,215,100,100);
        add(label17);
        JLabel label18 = new JLabel(imagen18);
        label18.setBounds(542,215,130,130);
        add(label18);
	    JLabel label19 = new JLabel(imagen19);
        label19.setBounds(680,215,100,100);
        add(label19);
	    JLabel label20 = new JLabel(imagen20);
        label20.setBounds(680,115,120,100);
        add(label20);
	    JLabel label21 = new JLabel(imagen21);
        label21.setBounds(800,95,120,100);
        add(label21);
	    JLabel label22 = new JLabel(imagen22);
        label22.setBounds(830,185,150,170);
        add(label22);
	    JLabel label23 = new JLabel(imagen23);
        label23.setBounds(830,345,120,120);
        add(label23);
	    JLabel label24 = new JLabel(imagen24);
        label24.setBounds(580,375,230,120);
        add(label24);
	    JLabel label25 = new JLabel(imagen25);	
        label25.setBounds(410,375,190,120);
        add(label25);        
    }

    public void simular(JTextField tf_runtime, JTextField tf_frecuencia, JTextField tf_cant, JTextField tf_espera, JTextField tf_espera_alm, String [] capacidades){
        formato = new DecimalFormat("0.00");

        int runtime = (Integer.parseInt(tf_runtime.getText())*3);
        progressBar.setMaximum(runtime);
        
        int frecuencia = Integer.parseInt(tf_frecuencia.getText());
        int cantidad = Integer.parseInt(tf_cant.getText());
        int espera = Integer.parseInt(tf_espera.getText());
        int espera_alm = Integer.parseInt(tf_espera_alm.getText());
        
        // Inicializar variables para rastrear el tiempo de uso de cada recurso
        int tiempoBanda = 2;
        double tiempoTotalBodega = 0.0;
        double tiempoTotalBatidora = 0.0;
        double tiempoTotalCortadora = 0.0;
        double tiempoTotalMaquinaChocolate = 0.0;
        double tiempoTotalMesa = 0.0;
        double tiempoTotalHorno = 0.0;
        double tiempoTotalEmpaquetadora = 0.0;
        double tiempoTotalCargador = 0.0;

        for (int i = 1; i <= runtime/3; i++) {
            // Proceso de Bodega
            for(int j = 0; j < 10; j++){
                tiempoTotalBodega += espera_alm;
            }
            
            // Proceso de Batidora
            tiempoTotalBatidora += espera;
            // Proceso de Cortadora
            tiempoTotalCortadora += espera;
            // Proceso de MaquinaChocolate
            tiempoTotalMaquinaChocolate += espera;
            // Proceso de Mesa
            tiempoTotalMesa += espera;
            // Proceso de Horno
            tiempoTotalHorno += espera;
            // Proceso de Empaquetadora
            tiempoTotalEmpaquetadora += espera;
            // Proceso de Cargador
            for(int j = 1; j < 10; j++){
                tiempoTotalCargador += espera;
            }
            
            // Simular tiempo de banda entre procesos
            tiempoTotalBodega += tiempoBanda;
            tiempoTotalBatidora += tiempoBanda;
            tiempoTotalCortadora += tiempoBanda;
            tiempoTotalMaquinaChocolate += tiempoBanda;
            tiempoTotalMesa += tiempoBanda;
            tiempoTotalHorno += tiempoBanda;
            tiempoTotalEmpaquetadora += tiempoBanda;
            tiempoTotalCargador += tiempoBanda;
        }
        
        int div1 = Integer.parseInt(capacidades[0])*frecuencia;
        int div2 = Integer.parseInt(capacidades[1])*frecuencia;
        int div3 = Integer.parseInt(capacidades[2])*frecuencia;
        int div4 = Integer.parseInt(capacidades[3])*frecuencia;
        int div5 = Integer.parseInt(capacidades[4])*frecuencia;
        int div6 = Integer.parseInt(capacidades[5])*frecuencia;
        int div7 = Integer.parseInt(capacidades[6])*frecuencia;
        int div8 = Integer.parseInt(capacidades[7])*frecuencia;

        // Calcular y mostrar el porcentaje de uso de cada recurso
        double uso_bodega = ((tiempoTotalBodega/div1) / (runtime/3)) * 100;
        double uso_batidora = ((tiempoTotalBatidora/div2) / (runtime/3)) * 100;
        double uso_cortadora = ((tiempoTotalCortadora/div3) / (runtime/3)) * 100;
        double uso_maq_chocolate = ((tiempoTotalMaquinaChocolate/div4) / (runtime/3)) * 100;
        double uso_mesa = ((tiempoTotalMesa/div5) / (runtime/3)) * 100;
        double uso_horno = ((tiempoTotalHorno/div6) / (runtime/3)) * 100;
        double uso_empaquetadora = ((tiempoTotalEmpaquetadora/div7) / (runtime/3)) * 100;
        double uso_cargador = ((tiempoTotalCargador/div8) /(runtime/3)) * 100;

        // Simulacion
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                label_mov3.setVisible(true);
                label_mov4.setVisible(true);
                label_mov5.setVisible(true);
                label_mov6.setVisible(true);
                double cantidad_productos = 0.0;
                for (int i = 0; i <= runtime; i++) {
                    Thread.sleep(50);
                    publish(i);

                    cantidad_productos += cantidad*i*frecuencia;
                    
                    // Hilo para mover la imagen

                    timer = new Timer(runtime/2, new ActionListener() {
                        int x1 = mov[0];
                        int y1 = mov[1];

                        int x2 = mov2[0];
                        int y2 = mov2[1];

                        int x3 = mov3[0];
                        int y3 = mov3[1];

                        int x4 = mov4[0];
                        int y4 = mov4[1];

                        int x5 = mov5[0];
                        int y5 = mov5[1];

                        int x6 = mov6[0];
                        int y6 = mov6[1];

                        int x7 = mov7[0];
                        int y7 = mov7[1];

                        int x8 = mov8[0];
                        int y8 = mov8[1];

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            x1 -= 5;  // movimiento del auto
                            x2 += 7;  // movimiento de la harina
                            x3 += 5;  // movimiento de la galleta
                            x4 -= 3;  // movimiento de la división galleta
                            y4 += 4;
                            x5 += 5;  // movimiento de galleta de chcolate
                            x6 += 5;  // movimiento de la galleta cocida
                            y6 -= 5;
                            x7 += 5;  // movimiento del chocolate
                            y7 -= 5; 
                            y8 += 6;  // movimiento de los paquetes

                            label_mov.setLocation(x1, y1);
                            label_mov2.setLocation(x2, y2);
                            label_mov3.setLocation(x3, y3);
                            label_mov4.setLocation(x4, y4);
                            label_mov5.setLocation(x5, y5);
                            label_mov6.setLocation(x6, y6);
                            label_mov7.setLocation(x7, y7);
                            label_mov8.setLocation(x8, y8);
                            repaint();
                        }   

                    });
                    timer.start();                   
                    // Almacenar el timer para poder detenerlo más tarde
                    TimerStorage.setTimer(timer);
                }
                double cantidad_promedio_productos = cantidad_productos / runtime;
                double time_promedio_espera = (espera * runtime * espera_alm) / cantidad_promedio_productos;
                JOptionPane.showMessageDialog(null, "Simulación Terminada");
                TimerStorage.stopTimer();
                JTextArea resultados = new JTextArea();
                resultados.setEditable(false);
                resultados.append("========= RESULTADOS DE LA SIMULACIÓN =========\n");
                resultados.append("Tiempo de ejecución: ... "+runtime/3+" hrs. \n\n");
                resultados.append("Uso de la Locación: ... Bodega --"+formato.format(uso_bodega)+" %\n");
                resultados.append("Uso de la Locación: ... Batidora --"+formato.format(uso_batidora)+" %\n");
                resultados.append("Uso de la Locación: ... Cortadora --"+formato.format(uso_cortadora)+" %\n");
                resultados.append("Uso de la Locación: ... Mesa --"+formato.format(uso_mesa)+" %\n");
                resultados.append("Uso de la Locación: ... Maquina de Chocolate --"+formato.format(uso_maq_chocolate)+" %\n");
                resultados.append("Uso de la Locación: ... Horno --"+formato.format(uso_horno)+" %\n");
                resultados.append("Uso de la Locación: ... Empaquetadora --"+formato.format(uso_empaquetadora)+" %\n");
                resultados.append("Uso de la Locación: ... Cargador --"+formato.format(uso_cargador)+" %\n\n");
                resultados.append("Cantidad de productos realizados --"+formato.format(cantidad_promedio_productos)+" \n\n");
                resultados.append("Tiempo promedio de espera --"+formato.format(time_promedio_espera)+" \n\n");
                 
                JScrollPane scrollPane = new JScrollPane(resultados);

                JPanel panel = new JPanel();
                panel.add(scrollPane);

                JOptionPane.showMessageDialog(null, panel, "Resultados", JOptionPane.INFORMATION_MESSAGE);
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                progressBar.setValue(progress);
            }

            @Override
            protected void done() {
                repaint();
            }
        };
        worker.execute();
    }

}
class TimerStorage {
    private static Timer timer;

    public static void setTimer(Timer t) {
        timer = t;
    }

    public static void stopTimer() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
    }
}