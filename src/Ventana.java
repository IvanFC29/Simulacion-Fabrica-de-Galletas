
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField tf_runTime;
	private JTextField tf_frecuencia;
	private JTextField tf_cant;
	private JTextField tf_espera;
	private JTextField tf_espera_alm;
	private JTextField tf_bodega;
	private JTextField tf_batidora;
	private JTextField tf_cortadora;
	private JTextField tf_mesa;
	private JTextField tf_chocolate;
	private JTextField tf_horno;
	private JTextField tf_paquet;
	private JTextField tf_cargador;

	/**
	 * Create the frame.
	 */
	public Ventana() {
        setTitle("Fabricación y empaquetado de galletas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1130, 700);
        setLocationRelativeTo(null);
        setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRunTime = new JLabel("Run Time (Hrs.):");
		lblRunTime.setBounds(23, 11, 93, 14);
		contentPane.add(lblRunTime);
		
		tf_runTime = new JTextField();
		tf_runTime.setBounds(126, 8, 86, 20);
		contentPane.add(tf_runTime);
		
		JButton btnSimular = new JButton("Run / Simular");
		btnSimular.setBounds(222, 7, 116, 23);
		contentPane.add(btnSimular);
		
        // Panel de los arribos
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel.setBounds(23, 36, 303, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Frecuencia de los Arribos (min):");
		lblNewLabel.setBounds(10, 11, 183, 14);
		panel.add(lblNewLabel);
		
		tf_frecuencia = new JTextField("3");
		tf_frecuencia.setBounds(203, 8, 86, 20);
		panel.add(tf_frecuencia);
		
		JLabel lblCantidadPorArribo = new JLabel("Cantidad por Arribo (All):");
		lblCantidadPorArribo.setBounds(10, 36, 183, 14);
		panel.add(lblCantidadPorArribo);
		
		tf_cant = new JTextField("1");
		tf_cant.setBounds(203, 39, 86, 20);
		panel.add(tf_cant);
		
        // Panel de los procesos
        JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_1.setBounds(335, 36, 333, 70);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTiempoDeEspera = new JLabel("Tiempo de espera de Procesos (min):");
		lblTiempoDeEspera.setBounds(10, 11, 227, 14);
		panel_1.add(lblTiempoDeEspera);
		
		tf_espera = new JTextField("2");
		tf_espera.setBounds(248, 8, 75, 20);
		panel_1.add(tf_espera);
		
		JLabel lblTiempoDeEspera_1 = new JLabel("Tiempo de espera del Almacen (min):");
		lblTiempoDeEspera_1.setBounds(10, 36, 227, 14);
		panel_1.add(lblTiempoDeEspera_1);
		
		tf_espera_alm = new JTextField("1");
		tf_espera_alm.setBounds(248, 33, 75, 20);
		panel_1.add(tf_espera_alm);
		
        // Panel de las locaciones 
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panel_2.setBounds(691, 36, 415, 109);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBodegacap = new JLabel("Bodega (cap):");
		lblBodegacap.setBounds(10, 11, 106, 14);
		panel_2.add(lblBodegacap);
		
		JLabel lblBatidoracap = new JLabel("Batidora (cap):");
		lblBatidoracap.setBounds(10, 36, 106, 14);
		panel_2.add(lblBatidoracap);
		
		JLabel lblCortadoracap = new JLabel("Cortadora (cap):");
		lblCortadoracap.setBounds(10, 61, 106, 14);
		panel_2.add(lblCortadoracap);
		
		JLabel lblMesacap = new JLabel("Mesa (cap):");
		lblMesacap.setBounds(10, 86, 106, 14);
		panel_2.add(lblMesacap);
		
		tf_bodega = new JTextField("10");
		tf_bodega.setBounds(126, 8, 50, 20);
		panel_2.add(tf_bodega);
		
		tf_batidora = new JTextField("7");
		tf_batidora.setBounds(126, 33, 50, 20);
		panel_2.add(tf_batidora);
		
		tf_cortadora = new JTextField("8");
		tf_cortadora.setBounds(126, 58, 50, 20);
		panel_2.add(tf_cortadora);
		
		tf_mesa = new JTextField("5");
		tf_mesa.setBounds(126, 83, 50, 20);
		panel_2.add(tf_mesa);
		
		JLabel lblMaqChcolatecap = new JLabel("Maq. Chcolate (cap):");
		lblMaqChcolatecap.setBounds(208, 11, 137, 14);
		panel_2.add(lblMaqChcolatecap);
		
		JLabel lblHornocap = new JLabel("Horno (cap):");
		lblHornocap.setBounds(208, 36, 110, 14);
		panel_2.add(lblHornocap);
		
		JLabel lblEmpaquetadoracap = new JLabel("Empaquetadora (cap) :");
		lblEmpaquetadoracap.setBounds(208, 61, 137, 14);
		panel_2.add(lblEmpaquetadoracap);
		
		JLabel lblCargadorcap = new JLabel("Cargador (cap):");
		lblCargadorcap.setBounds(206, 86, 122, 14);
		panel_2.add(lblCargadorcap);
		
		tf_chocolate = new JTextField("4");
		tf_chocolate.setBounds(355, 8, 50, 20);
		panel_2.add(tf_chocolate);
		
		tf_horno = new JTextField("5");
		tf_horno.setBounds(355, 33, 50, 20);
		panel_2.add(tf_horno);
		
		tf_paquet = new JTextField("6");
		tf_paquet.setBounds(355, 58, 50, 20);
		panel_2.add(tf_paquet);
		
		tf_cargador = new JTextField("10");
		tf_cargador.setBounds(355, 83, 50, 20);
		panel_2.add(tf_cargador);

		// Panel del Layout 
		LayoutPanel imagesPanel = new LayoutPanel();
		imagesPanel.setBounds(46, 157, 1000, 500);
		contentPane.add(imagesPanel);

        btnSimular.setOpaque(true);
        btnSimular.setBackground(new Color(162, 249, 127));
        btnSimular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				String cap_bodega = tf_bodega.getText();
				String cap_batidora = tf_batidora.getText();
				String cap_cortadora = tf_cortadora.getText();
				String cap_mesa = tf_mesa.getText();
				String cap_chocolate = tf_chocolate.getText();
				String cap_horno = tf_horno.getText();
				String cap_paquet = tf_paquet.getText();
				String cap_auto = tf_cargador.getText();
				String [] capacidades = {cap_bodega, cap_batidora, cap_cortadora, cap_mesa, cap_chocolate, cap_horno, cap_paquet, cap_auto};
                imagesPanel.simular(tf_runTime, tf_frecuencia, tf_cant, tf_espera, tf_espera_alm, capacidades);
            }
        });
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ventana frame = new Ventana();
		frame.setVisible(true);
	}
}
