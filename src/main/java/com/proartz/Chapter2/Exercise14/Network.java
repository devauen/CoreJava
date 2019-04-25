package com.proartz.Chapter2.Exercise14;

import java.util.ArrayList;

public class Network {
    public class Member { // Member jest klas� wewn�trzn� klasy Network
        private String name;
        private ArrayList<Member> friends = new ArrayList<>();

        public Member(String name) {
            this.name = name;
        }

        public void leave() {
            members.remove(this);
        }

        public void addFriend(Member newFriend) {
            friends.add(newFriend);
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }
        
        public String toString() {
            StringBuilder result = new StringBuilder(name);
            result.append(" i przyjaciele ");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }
    }

    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public String toString() {
        return members.toString();
    }
}