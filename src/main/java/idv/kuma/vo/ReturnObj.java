package idv.kuma.vo;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReturnObj {

    int errorCode;
    String message;

}
