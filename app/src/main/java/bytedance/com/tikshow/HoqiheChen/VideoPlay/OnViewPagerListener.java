package bytedance.com.tikshow.HoqiheChen.VideoPlay;

public interface OnViewPagerListener {

    void onInitComplete();

    void onPageRelease(boolean isNext, int position);

    void onPageSelected(int position, boolean isBottom);

}
