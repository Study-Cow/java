package ch3.hoon.item9;

/*
 * 배치에서 sqlSession 사용할 때 try-with-resource 사용
 * 1.24일 컴파일 버전 1.8로 변경되니까 이제 이런식으로 처리해도 될듯
 */

public class CpBatchSample {

    public static void main(String[] args) {
//        try(SqlSession sqlSession = getSqlSessionFactory().openSession()){
//
//            //로직 처리
//
//        } catch (Exception e) {
//            sqlSession.rollback();
//            throw e;
//        } finally {
//            //sqlSession 닫는건 안함.
//
//            //sql commit 처리
//            //sqlSession.commit();
//
//            //처리 결과를 이메일로 보내는 등의 처리만 finally에서 해줌
//
//        }
    }

}
