package mid_2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MemberRepository {

    Map<String, Member> members = new HashMap<>();

    public void save(Member member) {
        members.put(member.getId(), member);
    }

    public void remove(String id) {
        members.remove(id);
    }

    public Member findById(String id) {
        if (members.containsKey(id)) {
            return members.get(id);
        }
        return null;
    }

    public Member findByName(String name) {
        for (Member m : members.values()) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }
}
