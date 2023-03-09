package interfaceChallange;
enum Geometry{LINE, POINT, POLYGON}
enum Color{BLACK ,BLUE, GREEN, ORANGE, RED}
enum PointMaker{CIRCLE, PUSH_PIN, STAR, SQUARE,TRIANGLE}
enum LineMarker{DASHED, DOTTED, SOLID}
public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s} """;
    String getLabel();
    Geometry getShape();
    String getMaker();

    default String toJSON(){

        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(),getLabel(),getMaker());
    }
    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
