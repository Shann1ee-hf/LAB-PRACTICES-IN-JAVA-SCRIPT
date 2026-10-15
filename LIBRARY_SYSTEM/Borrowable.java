package LIBRARY_SYSTEM;

public interface Borrowable {
    void borrow(Member member) throws ItemNotAvailableException, MemberLimitExceededException;
    void giveBack();
}
