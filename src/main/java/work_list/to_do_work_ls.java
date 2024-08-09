package work_list;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
public class to_do_work_ls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int wk_id ;
    private String wk_nm;
    private String wk_status;



    public to_do_work_ls(int wk_id,String wk_nm,String wk_status)
    {
        super();
        this.wk_id=wk_id;
        this.wk_nm=wk_nm;
        this.wk_status=wk_status;
    }
    public to_do_work_ls(){
        super();
    }

    public int getWk_id() {
        return wk_id;
    }

    public void setWk_id(int wk_id) {
        this.wk_id = wk_id;
    }

    public String getWk_nm() {
        return wk_nm;
    }

    public void setWk_nm(String wk_nm) {
        this.wk_nm = wk_nm;
    }

    public String getWk_status() {
        return wk_status;
    }

    public void setWk_status(String wk_status) {
        this.wk_status = wk_status;
    }

    @Override
    public String toString() {
        return "to_do_work_ls{" +
                "wk_id=" + wk_id +
                ", wk_nm='" + wk_nm + '\'' +
                ", wk_status='" + wk_status + '\'' +
                '}';
    }
}
//package work_list;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class to_do_work_ls {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int wk_id;
//    private String wk_nm;
//    private String wk_status;
//
//    public to_do_work_ls(int wk_id, String wk_nm, String wk_status) {
//        super();
//        this.wk_id = wk_id;
//        this.wk_nm = wk_nm;
//        this.wk_status = wk_status;
//    }
//
//    public to_do_work_ls() {
//        super();
//    }
//
//    // Getters and Setters
//}
