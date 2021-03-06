package com.sinosdx.maven.dao.po;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * @Date 2020/11/10 10:14
 * @Author gongzhenyu
 */
@Builder(toBuilder = true)
@Getter
@Data
public class Product {

    private  int id;
    private  String name;
    private  int type;
    private  float price;

   /* private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.price = builder.price;
    }

    public static class Builder {
        private int id;
        private String name;
        private int type;
        private float price;

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder type(int type) {
            this.type = type;
            return this;
        }
        public Builder price(float price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }*/

}
