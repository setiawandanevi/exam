import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("person", new Person());
        return "add-person";
    }

    @PostMapping("/add")
    public String submitAddForm(Person person) {
        // Lakukan aksi untuk menyimpan data ke database atau tempat penyimpanan lainnya
        // Contoh: personRepository.save(person);
        return "redirect:/person/add"; // Redirect kembali ke halaman penambahan data
    }
}
