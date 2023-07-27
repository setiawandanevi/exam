
@Controller
@RequestMapping("/input")
public class Input {
     @GetMapping
    public String showInputForm(Model model) {
        model.addAttribute("inputData", new InputData());
        return "inputForm";
    }
     @PostMapping
    public String processInputForm(InputData inputData) {
        // Proses data yang diinput
        // Misalnya: menyimpan data ke database
        return "successPage";
    }
}
