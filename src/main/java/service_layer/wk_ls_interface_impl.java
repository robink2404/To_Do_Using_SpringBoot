//package service_layer;
//
//import connect_to_postgress.to_do_postgress;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import work_list.to_do_work_ls;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class wk_ls_interface_impl implements wk_ls_interface {
////    private List<to_do_work_ls> listing;
//    @Autowired
//    private to_do_postgress dbms;
//
//    public wk_ls_interface_impl() {
////        listing = new ArrayList<>();
////        listing.add(new to_do_work_ls(1, "Wake Up", "NOT_DONE"));
////        listing.add(new to_do_work_ls(2, "Brush", "NOT_DONE"));
//   }
//
//    @Override
//    public List<to_do_work_ls> get_list() {
////        return listing;
//        return dbms.findAll();
//    }
//
//    @Override
//    public to_do_work_ls get_work(long wk_id) {
////        to_do_work_ls wk=null;
////        for(to_do_work_ls work:listing)
////        {
////            if(work.getWk_id()==wk_id)
////            {
////                wk=work;
////            }
////        }
//        return dbms.getOne((int)wk_id);
//    }
//
//    @Override
//    public to_do_work_ls addwork(to_do_work_ls work) {
////        listing.add(work);
////        return work;
//        dbms.save(work);
//        return work;
//    }
//
////    @Override
////    public void delete_wk(Long wkId) {
//////        listing=this.listing.stream().filter(e->e.getWk_id()!=wkId).collect(Collectors.toUnmodifiableList());
////   to_do_work_ls work=dbms.getOne(wkId);
////   dbms.delete(work);
////    }
//
//    @Override
//    public to_do_work_ls updt_ls(to_do_work_ls wk) {
//
////        listing.forEach(e ->{
////            if (e.getWk_id()== wk.getWk_id())
////            {
////                e.setWk_nm(wk.getWk_nm());
////                e.setWk_status(wk.getWk_status());
////            }
////
////        });
//
//        dbms.save(wk);
//        return wk;
//    }
//}


package service_layer;

import connect_to_postgress.to_do_postgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work_list.to_do_work_ls;

import java.util.List;

@Service
public class wk_ls_interface_impl implements wk_ls_interface {

    private final to_do_postgress dbms;

    @Autowired
    public wk_ls_interface_impl(to_do_postgress dbms) {
        this.dbms = dbms;
    }

    @Override
    public List<to_do_work_ls> get_list() {
        return dbms.findAll();
    }

    @Override
    public to_do_work_ls get_work(long wk_id) {
        return dbms.findById((int) wk_id).orElse(null);
    }

    @Override
    public to_do_work_ls addwork(to_do_work_ls work) {
        return dbms.save(work);
    }

    @Override
    public to_do_work_ls updt_ls(to_do_work_ls wk) {
        return dbms.save(wk);
    }
}
