package memento.mementospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EditorController {

    History history = new History();
//    Editor editor = new Editor();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("snapshots", history.getAllSnaps());
        return "homepage";
    }

    @PostMapping("/savesnapshot")
    public String saveSnap(@ModelAttribute Editor editor){
//        history.addSnapshot(editor.makeSnapshot());
        history.addSnapshot(editor.makeSnapshot());
        return "redirect:/";
    }


}
