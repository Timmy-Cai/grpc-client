package com.example.user.controller;

import com.example.user.proto.UserProto;
import com.example.user.proto.UserServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  @GrpcClient("grpc-server")
  private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

  @GetMapping("/hi")
  public String hi(String name) {
    UserProto.StringResponse response = userServiceBlockingStub
        .hi(UserProto.StringRequest.newBuilder().setName(name).build());
    return response.getResult();

  }
}
