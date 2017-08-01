import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProduct {
    public static void main(String[] args)
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);

        Product p=new Product();
        p.setpName("Valve");
        p.setpId(1);
        p.setpQty(20);

        ProductDao bean1 = ctx.getBean(ProductDao.class);
        bean1.save(p);

    }

}
