package ti.umy.calculate;

import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class calculateController {
    @RequestMapping("/calculate")
    public String getDataSampling(Model model, HttpServletRequest param){
        
        String num1 = param.getParameter("num1");
        String num2 = param.getParameter("num2");
        String operator = param.getParameter("operator");
        double result;
        
        switch (operator) {
            case "+":
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case "-":
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case "*":
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case "/":
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                break;
            default:
                result = 0;
        }
        
        DecimalFormat df = new DecimalFormat("#.##");

        model.addAttribute("Num1", num1);
        model.addAttribute("Num2", num2);
        model.addAttribute("Operator", operator);
        model.addAttribute("Result", df.format(result));
        return "Index";
    }
}
