package hzyj.come.p2p.mvp.ui.fragment.homefragment;


import hzyj.come.p2p.mvp.entities.HomeIndex;

/**
 * @author admin
 */

public interface HomeContract {
    interface View {
        void setHomeIndexData(HomeIndex find);
        void setRecommendedWares(HomeIndex find);
        void setMoreRecommendedWares(HomeIndex find);
    }

    interface Presenter {
        void getHomeIndexData(int flag);
        void getRecommendedWares();
        void getMoreRecommendedWares();
    }

}