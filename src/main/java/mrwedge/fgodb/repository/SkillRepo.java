package mrwedge.fgodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mrwedge.fgodb.entity.Skill;

public interface SkillRepo extends JpaRepository<Skill, Integer> {

}
