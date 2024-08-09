package new_api.java17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service_layer.wk_ls_interface;
import work_list.to_do_work_ls;

import java.util.List;
@RestController
public class Mycontroller {

    @Autowired
    private wk_ls_interface wk_ls_cmp;

    @GetMapping("/home")
    public String home() {
        return "Welcome To my To Do List";
    }

    @GetMapping("/to_do_ls")
    public List<to_do_work_ls> get_list() {
        return this.wk_ls_cmp.get_list();
    }

    @GetMapping("/to_do_ls/{wk_id}")
    public to_do_work_ls get_work(@PathVariable String wk_id) {
        return this.wk_ls_cmp.get_work(Long.parseLong(wk_id));
    }

    @PostMapping("/to_do_ls")
    public to_do_work_ls post_list(@RequestBody to_do_work_ls work) {
        return this.wk_ls_cmp.addwork(work);
    }

    @PutMapping("/to_do_ls")
    public to_do_work_ls update_list(@RequestBody to_do_work_ls work) {
        return this.wk_ls_cmp.updt_ls(work);
    }

//    @DeleteMapping("/to_do_ls/{wk_id}")
//    public ResponseEntity<HttpStatus> delete_wk(@PathVariable Long wk_id) {
//        try {
//            this.wk_ls_cmp.delete_wk(wk_id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
