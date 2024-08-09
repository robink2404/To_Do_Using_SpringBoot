package connect_to_postgress;

import org.springframework.data.jpa.repository.JpaRepository;
import work_list.to_do_work_ls;

public interface to_do_postgress extends JpaRepository<to_do_work_ls, Integer> {
}

