//package service_layer;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//import work_list.to_do_work_ls;
//@Service
//public interface wk_ls_interface {
//
//    public List<to_do_work_ls> get_list();
//    public to_do_work_ls get_work(long wk_id);
//    public to_do_work_ls addwork(to_do_work_ls work);
//    public to_do_work_ls updt_ls(to_do_work_ls wk);
//
//
////    void delete_wk(Long wkId);
//}
package service_layer;

import work_list.to_do_work_ls;
import java.util.List;

public interface wk_ls_interface {
    List<to_do_work_ls> get_list();
    to_do_work_ls get_work(long wk_id);
    to_do_work_ls addwork(to_do_work_ls work);
    to_do_work_ls updt_ls(to_do_work_ls wk);
}

