JC?=javac
JAVA?=java
JFLAGS+=-g -cp src/

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
    src/pong/view/Assets.java \
    src/pong/view/PongMenu.java \
    src/pong/view/theme/Duckie.java \
    src/pong/view/theme/Cool.java \
    src/pong/view/PongGUI.java \
    src/pong/event/Event.java \
    src/pong/event/EventService.java \
    src/pong/model/Ball.java \
    src/pong/model/IPositionable.java \
    src/pong/model/Paddle.java \
    src/pong/model/Pong.java

default: classes
classes: $(CLASSES:.java=.class)

clean:
	$(RM) $(CLASSES:.java=.class)

test:
	$(JAVA) -cp src calculator/Test
