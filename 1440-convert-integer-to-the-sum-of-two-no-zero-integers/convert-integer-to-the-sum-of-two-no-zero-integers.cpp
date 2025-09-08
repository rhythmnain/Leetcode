class Solution {
public:
    vector<int> getNoZeroIntegers(int n) {
        auto hasZero = [](int x) {
            while (x) {
                if (x % 10 == 0) return true;
                x /= 10;
            }
            return false;
        };

        for (int a = 1; a < n; ++a) {
            int b = n - a;
            if (!hasZero(a) && !hasZero(b))
                return {a, b};
        }
        return {};
    }
};