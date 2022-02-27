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

        int hitung = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        model.addAttribute("dataHistory", hitung);
        return "Index";
    }
}
