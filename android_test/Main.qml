import QtQuick

Rectangle {
    width: parent.width
    height: parent.height
    visible: true
    color: "transparent"

    Text {
        id: helloText
        color: "black"
        text: qsTr("Hello World from QML")
        anchors.centerIn: parent
    }
}

