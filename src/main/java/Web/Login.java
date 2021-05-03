package Web;
import org.apache.commons.lang3.StringUtils;
public class Login {
    public static void main(String[] args){
        boolean rs=StringUtils.isNumeric("12");
        System.out.println(rs);
    }
}
