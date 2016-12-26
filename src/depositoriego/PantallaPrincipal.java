package depositoriego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Q;
	private JTextField txt_Zhid;
	private JTextField txt_Phid;
	private JTextField txt_L;
	private JTextField txt_n;
	private JTextField txt_g;
	private JTextField txt_Dinicial;
	private JTextField txt_Incremento;
	private double Q;
	private double Zhid;
	private double Phid;
	private double L;
	private double L1;
	private double n;
	private double g;
	private double Dinicial;
	private double Incremento;
	private JTextField txt_Zbomba;
	private double Zbomba;
	private JTable Jtbl_Zdep;
//	private static final double PI = Math.PI;
	private static final double PI = 3.1415926536;
	private JTable Jtbl_Hbomba;
	private int nroElementos = 10;
	private int filaSelec = 0;
	private JTextField txt_Dbomba;
	private JTextField txt_ZdepBomba;
	private double Dbomba;
	private double ZdepBomba;
	private JTextField txt_L1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1252, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelHidrante = new JPanel();
		panelHidrante.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Hidrante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelHidrante.setBounds(12, 12, 677, 464);
		contentPane.add(panelHidrante);
		panelHidrante.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caudal(Q)");
		lblNewLabel.setBounds(12, 26, 70, 15);
		panelHidrante.add(lblNewLabel);
		
		txt_Q = new JTextField();
		txt_Q.setText("0,01");
		txt_Q.setBounds(201, 26, 114, 19);
		panelHidrante.add(txt_Q);
		txt_Q.setColumns(10);
		
		JLabel lblZhid = new JLabel("Zhid");
		lblZhid.setBounds(12, 55, 70, 15);
		panelHidrante.add(lblZhid);
		
		txt_Zhid = new JTextField();
		txt_Zhid.setText("1115");
		txt_Zhid.setColumns(10);
		txt_Zhid.setBounds(201, 55, 114, 19);
		panelHidrante.add(txt_Zhid);
		
		JLabel lblPhid = new JLabel("Phid");
		lblPhid.setBounds(12, 84, 70, 15);
		panelHidrante.add(lblPhid);
		
		txt_Phid = new JTextField();
		txt_Phid.setText("15");
		txt_Phid.setColumns(10);
		txt_Phid.setBounds(201, 84, 114, 19);
		panelHidrante.add(txt_Phid);
		
		JLabel lblLongitudTuberial = new JLabel("Longitud Tuberia (L)");
		lblLongitudTuberial.setBounds(349, 28, 156, 15);
		panelHidrante.add(lblLongitudTuberial);
		
		txt_L = new JTextField();
		txt_L.setText("1500");
		txt_L.setColumns(10);
		txt_L.setBounds(538, 26, 114, 19);
		panelHidrante.add(txt_L);
		
		JLabel lblNManning = new JLabel("n Manning");
		lblNManning.setBounds(349, 57, 138, 15);
		panelHidrante.add(lblNManning);
		
		txt_n = new JTextField();
		txt_n.setText("0,008");
		txt_n.setColumns(10);
		txt_n.setBounds(538, 55, 114, 19);
		panelHidrante.add(txt_n);
		
		JLabel lblAcGravedad = new JLabel("AC. Gravedad");
		lblAcGravedad.setBounds(349, 84, 138, 15);
		panelHidrante.add(lblAcGravedad);
		
		txt_g = new JTextField();
		txt_g.setText("9,81");
		txt_g.setColumns(10);
		txt_g.setBounds(538, 82, 114, 19);
		panelHidrante.add(txt_g);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 232, 640, 188);
		panelHidrante.add(scrollPane);
		
		Jtbl_Zdep = new JTable();
		Jtbl_Zdep.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				txt_L1.setText(String.valueOf(L));
				filaSelec = Jtbl_Zdep.rowAtPoint(e.getPoint());
				System.out.println("filaSelec: " + filaSelec);
//				Dbomba = (double) Jtbl_Zdep.getValueAt(filaSelec,1);
//				txt_Dbomba.setText(String.valueOf(Dbomba));
//				ZdepBomba = (double) Jtbl_Zdep.getValueAt(0,3);
				ZdepBomba = (double) Jtbl_Zdep.getValueAt(filaSelec,3);
				txt_ZdepBomba.setText(String.valueOf(ZdepBomba));
//		         int fila = Jtbl_Zdep.rowAtPoint(e.getPoint());
//		         int columna = Jtbl_Zdep.columnAtPoint(e.getPoint());
//		         if ((fila > -1) && (columna > -1)){
//		            System.out.println("fila: " + fila + " columna: " + columna + "   " + Jtbl_Zdep.getValueAt(fila,columna) );
//		         }
				calcularGrafica();
			}
		});
		Jtbl_Zdep.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"D (mm)", "Diametro (D) (m)", "Perdidas gravedad", "Zdep", "Dif cotas", "Hgeo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		Jtbl_Zdep.getColumnModel().getColumn(0).setPreferredWidth(50);
		Jtbl_Zdep.getColumnModel().getColumn(2).setPreferredWidth(151);
		scrollPane.setViewportView(Jtbl_Zdep);

//		Calcular la parrilla del hidrante --------------------------------------------------------------
		JButton btn_Hid_Calcular = new JButton("Calcular");
		btn_Hid_Calcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leerVariablesPantalla();
				llenarTablaResutaldoHidrante();
				txt_Dbomba.setText("0,1");
				txt_L1.setText("30");
			}
		});
		btn_Hid_Calcular.setBounds(12, 170, 117, 25);
		panelHidrante.add(btn_Hid_Calcular);
		
		JLabel lblDmmInicial = new JLabel("D(mm) Inicial");
		lblDmmInicial.setBounds(12, 113, 138, 15);
		panelHidrante.add(lblDmmInicial);
		
		txt_Dinicial = new JTextField();
		txt_Dinicial.setText("90");
		txt_Dinicial.setColumns(10);
		txt_Dinicial.setBounds(201, 113, 114, 19);
		panelHidrante.add(txt_Dinicial);
		
		JLabel lblIncrementoDmm = new JLabel("Incremento D(mm)");
		lblIncrementoDmm.setBounds(12, 143, 138, 15);
		panelHidrante.add(lblIncrementoDmm);
		
		txt_Incremento = new JTextField();
		txt_Incremento.setText("15");
		txt_Incremento.setColumns(10);
		txt_Incremento.setBounds(201, 139, 114, 19);
		panelHidrante.add(txt_Incremento);
		
		JLabel lblZBomba = new JLabel("Z Bomba");
		lblZBomba.setBounds(349, 145, 138, 15);
		panelHidrante.add(lblZBomba);
		
		txt_Zbomba = new JTextField();
		txt_Zbomba.setText("1050");
		txt_Zbomba.setColumns(10);
		txt_Zbomba.setBounds(538, 143, 114, 19);
		panelHidrante.add(txt_Zbomba);
		
		JPanel panelBomba = new JPanel();
		panelBomba.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Bomba", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)), "Bomba", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 51, 255)));
		panelBomba.setBounds(759, 12, 458, 464);
		contentPane.add(panelBomba);
		panelBomba.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 235, 434, 188);
		panelBomba.add(scrollPane_1);
		
		Jtbl_Hbomba = new JTable();
		Jtbl_Hbomba.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"q  (m3/s)", "hb", "Q (m3/h)"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(Jtbl_Hbomba);
		
		JLabel lblDimetro = new JLabel("Diámetro ");
		lblDimetro.setBounds(12, 56, 138, 15);
		panelBomba.add(lblDimetro);
		
		txt_Dbomba = new JTextField();
		txt_Dbomba.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calcularGrafica();
			}
		});
		txt_Dbomba.setText("0");
		txt_Dbomba.setColumns(10);
		txt_Dbomba.setBounds(112, 54, 76, 19);
		panelBomba.add(txt_Dbomba);
		
		JLabel lblZdep = new JLabel("Zdep");
		lblZdep.setBounds(12, 29, 138, 15);
		panelBomba.add(lblZdep);
		
		txt_ZdepBomba = new JTextField();
		txt_ZdepBomba.setEditable(false);
		txt_ZdepBomba.setText("0");
		txt_ZdepBomba.setColumns(10);
		txt_ZdepBomba.setBounds(112, 27, 258, 19);
		panelBomba.add(txt_ZdepBomba);
		
		JLabel lblLongitudl = new JLabel("Longitud (L)");
		lblLongitudl.setBounds(206, 56, 94, 15);
		panelBomba.add(lblLongitudl);
		
		txt_L1 = new JTextField();
		txt_L1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calcularGrafica();
			}
		});
		txt_L1.setText("0");
		txt_L1.setColumns(10);
		txt_L1.setBounds(304, 52, 66, 19);
		panelBomba.add(txt_L1);
	}

//-----------------------------------------------------------------------------------------------	
	protected void calcularGrafica() {
		
		double pq = 0;
		double qms = 0;
		double qmh = 0;
		double hb = 0;
		double expo = 16/3D;
		double incremento = 0.005;
		String Junta;
		Junta = txt_L1.getText().replace(',', '.');
		L1 = Double.parseDouble(Junta);
		Junta = txt_Dbomba.getText().replace(',', '.');
		Dbomba = Double.parseDouble(Junta);

//		JOptionPane.showMessageDialog(null, "L1: " + L1 + "  filaSelec: " + filaSelec  + "  Dbomba: " + Dbomba + " ZdepBomba: " + ZdepBomba);

		for (int i = 0; i < nroElementos; i++) {
			qmh = qms * 3600;
			Jtbl_Hbomba.setValueAt(qms, i,0);
			Jtbl_Hbomba.setValueAt(qmh, i,2);
// =$E$8-$K$4+((1,2*$F$4*($F$5^2)*(4^(12/3))*(M6^2))/(($C$13^(16/3))*(PI()^2)))			
			pq = ((1.2D * L1 * Math.pow(n,2) * Math.pow(4,4) * Math.pow(qms,2)) / (Math.pow((double) Dbomba,expo) * Math.pow(PI,2)));
			hb = ZdepBomba - Zbomba + pq;
			Jtbl_Hbomba.setValueAt(hb, i,1);
			
			qms = qms + incremento;
		}
		
	}

//-----------------------------------------------------------------------------------------------	
	protected void leerVariablesPantalla() {
		String Junta;
		Junta = txt_Q.getText().replace(',', '.');
		Q = Double.parseDouble(Junta);
		Junta = txt_L.getText().replace(',', '.');
		L = Double.parseDouble(Junta);
		Junta = txt_n.getText().replace(',', '.');
		n = Double.parseDouble(Junta);
		Junta = txt_g.getText().replace(',', '.');
		g = Double.parseDouble(Junta);
		Junta = txt_Phid.getText().replace(',', '.');
		Phid = Double.parseDouble(Junta);
		Junta = txt_Zhid.getText().replace(',', '.');
		Zhid = Double.parseDouble(Junta);
    	Junta = txt_Dinicial.getText().replace(',', '.');
    	Dinicial = Double.parseDouble(Junta);
    	Junta = txt_Incremento.getText().replace(',', '.');
		Incremento = Double.parseDouble(Junta);
    	Junta = txt_Zbomba.getText().replace(',', '.');
    	Zbomba = Double.parseDouble(Junta);
		
	
	}

//-----------------------------------------------------------------------------------------------	
	protected void llenarTablaResutaldoHidrante() {

		double a = 0; 
		double d = 0.0;
		double pg = 0.0;
		double zdep = 0.0;
		double difcotas = 0.0;
		double expo = 16/3D;
		double hgeo = 0;
		
		
		System.out.println("expo: " + expo); 
//		JOptionPane.showMessageDialog(null, " " + Q + " " + L + " " + Zhid + " " + n + " " + Phid + " " + g );
		a = Dinicial;

		for (int i = 0; i < nroElementos; i++) {
//			JOptionPane.showMessageDialog(null, "i:" + i + " a:" + a + " d:" + d);
			d = ((double)a / 1000);
			
//   (1,2*$F$4*($F$5^2)*(4^(12/3))*(M6^2))/(($C$13^(16/3))*(PI()^2)))			
			
// =((1,2*$F$4*($F$5^2)*(4^(12/3))*($C$4^2))/((C8^(16/3))*(PI()^2)))			
//			JOptionPane.showMessageDialog(null, "L:" + L + " n:" + n + " d:" + d + " (Math.pow(d,(16/3)):" + Math.pow(d,(16/3)) + " Math.pow(4,4): " + Math.pow(4,4) + " Math.pow(Q,2): " + Math.pow(Q,2) + " Math.pow(PI,2): " + Math.pow(PI,2) );
			System.out.println(("L:" + L + " Math.pow(n,2):" + Math.pow(n,2) + " d:" + d + " (Math.pow(d,expo):" + Math.pow(d, (16 / 3))
					+ " Math.pow(4,4): " + Math.pow(4, 4) + " Math.pow(Q,2): " + Math.pow(Q, 2) + " Math.pow(PI,2): "
					+ Math.pow(PI, 2)));
//			pg = ((1.2D * L * Math.pow(n,2) * Math.pow(4,4) * Math.pow(Q,2)) / (Math.pow(d,(16/3)) * Math.pow(PI,2)));
			pg = ((1.2D * L * Math.pow(n,2) * Math.pow(4,4) * Math.pow(Q,2)) / (Math.pow(d,expo) * Math.pow(PI,2)));
// =$C$5+$C$6+((8*$C$4^2)/($F$6*(PI()^2)*(C8^4)))+((1,2*$F$4*($F$5^2)*(4^(12/3))*($C$4^2))/((C8^(16/3))*(PI()^2)))			
//			zdep = Zhid + Phid + ((8 * Math.pow(Q,2))/(g * Math.pow(PI,2) * Math.pow(d,4))) + (1.2 * L * Math.pow(n,2) * 16 * Math.pow(Q,2)) / (Math.pow(d,(16/3)) * Math.pow(PI,2));
			zdep = Zhid + Phid + ((8 * Math.pow(Q,2))/(g * Math.pow(PI,2) * Math.pow(d,4))) + pg;
			difcotas = zdep - Zhid;
			hgeo = zdep - Zbomba;
			Jtbl_Zdep.setValueAt(a,i,0);
			Jtbl_Zdep.setValueAt(d,i,1);
			Jtbl_Zdep.setValueAt(pg,i,2);
			Jtbl_Zdep.setValueAt(zdep,i,3);
			Jtbl_Zdep.setValueAt(difcotas,i,4);
			Jtbl_Zdep.setValueAt(hgeo,i,5);
			a = a + Incremento;
		}
		
	}
}


