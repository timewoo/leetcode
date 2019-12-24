import run.SubdomainVisitCount;

import java.util.List;

public class SubdomainVisitCountRun {

    public static void main(String[] args) {
        String[] subdomainVisitCountData = {"9001 discuss.leetcode.com"};
        SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();
        List<String> list = subdomainVisitCount.subdomainVisits(subdomainVisitCountData);
        System.out.println(list);
    }
}
