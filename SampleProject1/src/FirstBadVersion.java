public class FirstBadVersion extends VersionControl{
    public static int firstBadVersion(int n) {

        for (int i = n / 2; i <= n; ++i)
            if (isBadVersion(i))
                return i;
        for (int i = 1; i <= n / 2; ++i)
            if (isBadVersion(i))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        firstBadVersion(4); //2126753390

    }
}
class VersionControl{
    static boolean isBadVersion(int version){
        if (version == 1) //1702766719
            return true;
        return false;
    }
}
