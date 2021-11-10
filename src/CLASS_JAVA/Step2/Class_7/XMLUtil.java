package CLASS_JAVA.Step2.Class_7;

import org.w3c.dom.*;
import java.io.*;
import javax.xml.parsers.*;

public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory dFaCTORY= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= dFaCTORY.newDocumentBuilder();
            Document doc;
            doc= builder.parse(new File("src//CLASS_JAVA//Step2//Class_7//config.xml"));
            NodeList nl=doc.getElementsByTagName("className");
            Node classNode= nl.item(0).getFirstChild();
            String cName= classNode.getNodeValue();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
