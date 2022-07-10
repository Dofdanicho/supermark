package supermark.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarValores_BDD {

	// Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/supermarket";
	// Credenciales de la BDD
	static final String USER = "root";
	static final String PASS = "123456fioatb004#A";

	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;

		try {
			// PASO 2: Registrar JDBC driver
			Class.forName(JDBC_DRIVER);

			// PASO3: Abrir una Conexion
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// PASO 4: Ejecutar una sentencia SQL
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;

			/*sql = "INSERT INTO domicilio\r\n" 
					+ "VALUES\r\n" 
					+ "		('1','Salta','Capital','Tres Cerritos','Av. Bicentenario','2010'), \r\n" 
					+ "		('2','Salta','Capital','Villa Lujan','Necochea','1500'), \r\n"
					+ "		('3', 'Salta', 'Capital', 'Mosconi','Pedriel','780'),\r\n"
					+ "		('4', 'Salta', 'Capital', '20 Febrero','Ibazeta','1240'),\r\n" 
					+ " 	('5','Salta', 'Capital','Los Robles','Las moras','52')\r\n"
					+ "		('6','Salta','Capital','20 de Febrero','Av. Entre Rios','1130'), \r\n"
					+ "		('7','Salta','Capital','San Luis','Av. el Salvador','550') \r\n"
					+ ";";*/

			sql = "INSERT INTO tipoCasa\r\n"
					+ "VALUES\r\n" 
					+ "		('1','Casa','0','0','1'),\r\n"
					+ "		('2','Casa','0','0','2'),\r\n"
					+ "		('3', 'Departamento', '1', '2','3'),\r\n"
					+ "		('4', 'Departamento', '3', '5','4'),\r\n" 
					+ " 	('5','Departamento', '10','4','5'),\r\n"
					+ "		('6','Departamento','8','9','6')\r\n"
				// "		('7','Casa','','','7') \r\n"
					+ ";";
			
	/*sql = "INSERT INTO tipoCasa\r\n" 
					+ "VALUES\r\n" 
					+ "		('1','Abigail','Perrone','Cafune','1998/03/28','abigailpc@gmail.com','38745120','Cliente','1'), \r\n" 
					+ "		('2','Micaela','Lampone','Villa','1999/04/22','mica_lampo@gmail.com','39120461','Cliente Regular','2'), \r\n" 
					+ "		('3','Marcos','Colque','','2000/05/02','marcosC@gmail.com','41710140','Cliente','3'), \r\n" 
					+ "		('4','Pablo','Ramos','Blanco','2001/06/09','pabloRB@gmail.com','43612749','Cliente Regular','4'), \r\n" 
					+ "		('5','Emanuel','Mansione','Cozzetti','1991/03/28','manuMansionn@gmail.com','33546888','Administrador','5'), \r\n" 
					+ "		('6','Maria','Maximum','','2001/08/19','maximari@gmail.com','42301002','Cliente regular','6'), \r\n" 
					+ "		('7','Tomas','Perez','Corrientes','1998/05/23','tomasPP@gmail.com','38745120','Cliente','7') \r\n" 
					+ ";";
	*/
	/*sql = "INSERT INTO Registrarse\r\n" 
					+ "VALUES\r\n" 
					+ "		('1','Abigail','Perrone','1998/03/28','abi_PC','123456aaA','abigailpc@gmail.com','1'), \r\n" 
					+ "		('2','Micaela','Lampone','1999/04/22','MicaelaLampone','cafeconLE','mica_lampo@gmail.com','2'), \r\n" 
					+ "		('3','Marcos','Colque','2000/05/02','MarcosColque11','000MColque','marcosC@gmail.com','3'), \r\n" 
					+ "		('4','Pablo','Ramos','2001/06/09','Pablo Ramos','degfirnt','pabloRB@gmail.com','4'), \r\n" 
					+ "		('5','Emanuel','Mansione','1991/03/28','ManuMansione','pplato08','manuMansionn@gmail.com','5'), \r\n" 
					+ "		('6','Maria','Maximum','2001/08/19','MMaria','maria087m','maximari@gmail.com','6'), \r\n" 
					+ "		('7','Tomas','Perez','1998/05/23','Perez__Tomas','tomi1223P','tomasPP@gmail.com','7') \r\n" 
					+ ";";*/
			
			/*l = "INSERT INTO Tarjeta\r\n"
					+ "VALUES\r\n"
					+ "		('240 9784 5420','Santander Rio','Abigail Perrone','2023/08','1'),\r\n"
					+ "		('132 8790 0001','Galicia', 'Micaela Lampone','2024/09','2'),\r\n
					+ "		('206 4489 7512','Macro','Marcos Colque','2023/04','3')\r\n"
					+ "		('345 1540 0003','
					+";";*/
			
			stmt.executeUpdate(sql);
			System.out.println("Valores Insertados con Exito");
			
			// PASO6: Entorno de Limpieza
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Resolver errores para JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Resolver errores para Class.forName
			e.printStackTrace();
		} finally {
			// Bloque finalmente utilizado para cerrar recursos
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // Nada que podamos hacer
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // cierra finally try
		} // cierra try
		System.out.println("Goodbye!");

	} // cierra metodo principal (main)

} // cierra clase
