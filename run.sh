javac -d out --module-source-path "./*/src/" -m com.fun.facades

java --module-path out -m com.fun.facades/com.fun.facades.startup.Main
