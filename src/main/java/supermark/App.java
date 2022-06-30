package supermark;

import static spark.Spark.*;
import org.apache.log4j.PropertyConfigurator;
import com.google.gson.Gson;

public class App {
	 public static void main(String[]args){
		   String log4jConfPath = "E:/2022/CursoJava1000programadores/Modulo6/supermark/to/log4j.properties";
		   PropertyConfigurator.configure(log4jConfPath);
	       Gson mapper= new Gson();
	       port(8080);
	       get("/saludo", (req,res) -> new Usuario("Daniel","Fabian"), mapper::toJson);
	   }

}
