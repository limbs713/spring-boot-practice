package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewMemberRepository extends JpaRepository<Member, Long> {

}
