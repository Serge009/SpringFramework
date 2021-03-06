import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Matrix on 22.07.2014.
 */
public class DrawingApp {
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
    }
}
