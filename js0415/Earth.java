package js0415;

public class Earth {
    // 상수 선언 (대문자 사용)
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    // 정적 블록을 이용한 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}