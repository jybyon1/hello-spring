package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //Optional : null을 그대로 반환하지 않고 옵션 처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
