FROM registry.cn-hangzhou.aliyuncs.com/udh/jdk:1.8.141


USER spark

WORKDIR /home/spark/

RUN wget https://archive.apache.org/dist/spark/spark-3.2.3/spark-3.2.3-bin-hadoop3.2.tgz && tar -zxvf spark-3.2.3-bin-hadoop3.2.tgz -C /home/spark/ \
    && rm -f spark-3.2.3-bin-hadoop3.2.tgz && mv spark-3.2.3-bin-hadoop3.2  apache-spark

ENV SPARK_HOME=/home/spark/apache-spark

ENV PATH=$PATH:$SPARK_HOME/bin:$SPARK_HOME/sbin



