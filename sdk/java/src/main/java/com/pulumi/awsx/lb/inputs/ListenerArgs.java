// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.lb.inputs;

import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides a Load Balancer Listener resource.
 * 
 * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 * 
 * ## Example Usage
 * ### Forward Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndTargetGroup = new TargetGroup(&#34;frontEndTargetGroup&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;443&#34;)
 *             .protocol(&#34;HTTPS&#34;)
 *             .sslPolicy(&#34;ELBSecurityPolicy-2016-08&#34;)
 *             .certificateArn(&#34;arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .targetGroupArn(frontEndTargetGroup.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * To a NLB:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var frontEnd = new Listener(&#34;frontEnd&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(aws_lb.front_end().arn())
 *             .port(&#34;443&#34;)
 *             .protocol(&#34;TLS&#34;)
 *             .certificateArn(&#34;arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4&#34;)
 *             .alpnPolicy(&#34;HTTP2Preferred&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .targetGroupArn(aws_lb_target_group.front_end().arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Redirect Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;redirect&#34;)
 *                 .redirect(ListenerDefaultActionRedirectArgs.builder()
 *                     .port(&#34;443&#34;)
 *                     .protocol(&#34;HTTPS&#34;)
 *                     .statusCode(&#34;HTTP_301&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Fixed-response Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type(&#34;fixed-response&#34;)
 *                 .fixedResponse(ListenerDefaultActionFixedResponseArgs.builder()
 *                     .contentType(&#34;text/plain&#34;)
 *                     .messageBody(&#34;Fixed response content&#34;)
 *                     .statusCode(&#34;200&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Authenticate-cognito Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.cognito.UserPool;
 * import com.pulumi.aws.cognito.UserPoolClient;
 * import com.pulumi.aws.cognito.UserPoolDomain;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndTargetGroup = new TargetGroup(&#34;frontEndTargetGroup&#34;);
 * 
 *         var pool = new UserPool(&#34;pool&#34;);
 * 
 *         var client = new UserPoolClient(&#34;client&#34;);
 * 
 *         var domain = new UserPoolDomain(&#34;domain&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(            
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;authenticate-cognito&#34;)
 *                     .authenticateCognito(ListenerDefaultActionAuthenticateCognitoArgs.builder()
 *                         .userPoolArn(pool.arn())
 *                         .userPoolClientId(client.id())
 *                         .userPoolDomain(domain.domain())
 *                         .build())
 *                     .build(),
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;forward&#34;)
 *                     .targetGroupArn(frontEndTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Authenticate-OIDC Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndTargetGroup = new TargetGroup(&#34;frontEndTargetGroup&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(frontEndLoadBalancer.arn())
 *             .port(&#34;80&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .defaultActions(            
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;authenticate-oidc&#34;)
 *                     .authenticateOidc(ListenerDefaultActionAuthenticateOidcArgs.builder()
 *                         .authorizationEndpoint(&#34;https://example.com/authorization_endpoint&#34;)
 *                         .clientId(&#34;client_id&#34;)
 *                         .clientSecret(&#34;client_secret&#34;)
 *                         .issuer(&#34;https://example.com&#34;)
 *                         .tokenEndpoint(&#34;https://example.com/token_endpoint&#34;)
 *                         .userInfoEndpoint(&#34;https://example.com/user_info_endpoint&#34;)
 *                         .build())
 *                     .build(),
 *                 ListenerDefaultActionArgs.builder()
 *                     .type(&#34;forward&#34;)
 *                     .targetGroupArn(frontEndTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Gateway Load Balancer Listener
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.LoadBalancerArgs;
 * import com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
 * import com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerType(&#34;gateway&#34;)
 *             .subnetMappings(LoadBalancerSubnetMappingArgs.builder()
 *                 .subnetId(aws_subnet.example().id())
 *                 .build())
 *             .build());
 * 
 *         var exampleTargetGroup = new TargetGroup(&#34;exampleTargetGroup&#34;, TargetGroupArgs.builder()        
 *             .port(6081)
 *             .protocol(&#34;GENEVE&#34;)
 *             .vpcId(aws_vpc.example().id())
 *             .healthCheck(TargetGroupHealthCheckArgs.builder()
 *                 .port(80)
 *                 .protocol(&#34;HTTP&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .loadBalancerArn(exampleLoadBalancer.id())
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .targetGroupArn(exampleTargetGroup.id())
 *                 .type(&#34;forward&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Listeners can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
 * ```
 * 
 */
public final class ListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @Import(name="alpnPolicy")
    private @Nullable Output<String> alpnPolicy;

    /**
     * @return Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    public Optional<Output<String>> alpnPolicy() {
        return Optional.ofNullable(this.alpnPolicy);
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    /**
     * @return ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @Import(name="defaultActions")
    private @Nullable Output<List<ListenerDefaultActionArgs>> defaultActions;

    /**
     * @return Configuration block for default actions. Detailed below.
     * 
     */
    public Optional<Output<List<ListenerDefaultActionArgs>>> defaultActions() {
        return Optional.ofNullable(this.defaultActions);
    }

    /**
     * Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @Import(name="sslPolicy")
    private @Nullable Output<String> sslPolicy;

    /**
     * @return Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    public Optional<Output<String>> sslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ListenerArgs() {}

    private ListenerArgs(ListenerArgs $) {
        this.alpnPolicy = $.alpnPolicy;
        this.certificateArn = $.certificateArn;
        this.defaultActions = $.defaultActions;
        this.port = $.port;
        this.protocol = $.protocol;
        this.sslPolicy = $.sslPolicy;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerArgs $;

        public Builder() {
            $ = new ListenerArgs();
        }

        public Builder(ListenerArgs defaults) {
            $ = new ListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alpnPolicy Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
         * 
         * @return builder
         * 
         */
        public Builder alpnPolicy(@Nullable Output<String> alpnPolicy) {
            $.alpnPolicy = alpnPolicy;
            return this;
        }

        /**
         * @param alpnPolicy Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
         * 
         * @return builder
         * 
         */
        public Builder alpnPolicy(String alpnPolicy) {
            return alpnPolicy(Output.of(alpnPolicy));
        }

        /**
         * @param certificateArn ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        /**
         * @param certificateArn ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        /**
         * @param defaultActions Configuration block for default actions. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultActions(@Nullable Output<List<ListenerDefaultActionArgs>> defaultActions) {
            $.defaultActions = defaultActions;
            return this;
        }

        /**
         * @param defaultActions Configuration block for default actions. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultActions(List<ListenerDefaultActionArgs> defaultActions) {
            return defaultActions(Output.of(defaultActions));
        }

        /**
         * @param defaultActions Configuration block for default actions. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultActions(ListenerDefaultActionArgs... defaultActions) {
            return defaultActions(List.of(defaultActions));
        }

        /**
         * @param port Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param sslPolicy Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
         * 
         * @return builder
         * 
         */
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        /**
         * @param sslPolicy Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
         * 
         * @return builder
         * 
         */
        public Builder sslPolicy(String sslPolicy) {
            return sslPolicy(Output.of(sslPolicy));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ListenerArgs build() {
            return $;
        }
    }

}