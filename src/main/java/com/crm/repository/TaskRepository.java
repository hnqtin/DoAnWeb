package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String>{
	Task findByName(String name);
	//@Query("SELECT new com.crm.dto.TaskDTO(t.name, t.endDate, t.groupId, g.name, t.userId, u.fullname, t.statusId, s.)");
}
