// *** WARNING: this file was generated by pulumi-gen-awsx. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Awsx.Ec2.Inputs
{

    /// <summary>
    /// {{% examples %}}
    /// ## Example Usage
    /// {{% example %}}
    /// ### Basic
    /// 
    /// ```typescript
    /// import * as pulumi from "@pulumi/pulumi";
    /// import * as aws from "@pulumi/aws";
    /// 
    /// const s3 = new aws.ec2.VpcEndpoint("s3", {
    ///     vpcId: aws_vpc.main.id,
    ///     serviceName: "com.amazonaws.us-west-2.s3",
    /// });
    /// ```
    /// ```python
    /// import pulumi
    /// import pulumi_aws as aws
    /// 
    /// s3 = aws.ec2.VpcEndpoint("s3",
    ///     vpc_id=aws_vpc["main"]["id"],
    ///     service_name="com.amazonaws.us-west-2.s3")
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var s3 = new Aws.Ec2.VpcEndpoint("s3", new()
    ///     {
    ///         VpcId = aws_vpc.Main.Id,
    ///         ServiceName = "com.amazonaws.us-west-2.s3",
    ///     });
    /// 
    /// });
    /// ```
    /// ```go
    /// package main
    /// 
    /// import (
    /// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
    /// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
    /// )
    /// 
    /// func main() {
    /// 	pulumi.Run(func(ctx *pulumi.Context) error {
    /// 		_, err := ec2.NewVpcEndpoint(ctx, "s3", &amp;ec2.VpcEndpointArgs{
    /// 			VpcId:       pulumi.Any(aws_vpc.Main.Id),
    /// 			ServiceName: pulumi.String("com.amazonaws.us-west-2.s3"),
    /// 		})
    /// 		if err != nil {
    /// 			return err
    /// 		}
    /// 		return nil
    /// 	})
    /// }
    /// ```
    /// ```java
    /// package generated_program;
    /// 
    /// import com.pulumi.Context;
    /// import com.pulumi.Pulumi;
    /// import com.pulumi.core.Output;
    /// import com.pulumi.aws.ec2.VpcEndpoint;
    /// import com.pulumi.aws.ec2.VpcEndpointArgs;
    /// import java.util.List;
    /// import java.util.ArrayList;
    /// import java.util.Map;
    /// import java.io.File;
    /// import java.nio.file.Files;
    /// import java.nio.file.Paths;
    /// 
    /// public class App {
    ///     public static void main(String[] args) {
    ///         Pulumi.run(App::stack);
    ///     }
    /// 
    ///     public static void stack(Context ctx) {
    ///         var s3 = new VpcEndpoint("s3", VpcEndpointArgs.builder()        
    ///             .vpcId(aws_vpc.main().id())
    ///             .serviceName("com.amazonaws.us-west-2.s3")
    ///             .build());
    /// 
    ///     }
    /// }
    /// ```
    /// ```yaml
    /// resources:
    ///   s3:
    ///     type: aws:ec2:VpcEndpoint
    ///     properties:
    ///       vpcId: ${aws_vpc.main.id}
    ///       serviceName: com.amazonaws.us-west-2.s3
    /// ```
    /// {{% /example %}}
    /// {{% example %}}
    /// ### Basic w/ Tags
    /// 
    /// ```typescript
    /// import * as pulumi from "@pulumi/pulumi";
    /// import * as aws from "@pulumi/aws";
    /// 
    /// const s3 = new aws.ec2.VpcEndpoint("s3", {
    ///     vpcId: aws_vpc.main.id,
    ///     serviceName: "com.amazonaws.us-west-2.s3",
    ///     tags: {
    ///         Environment: "test",
    ///     },
    /// });
    /// ```
    /// ```python
    /// import pulumi
    /// import pulumi_aws as aws
    /// 
    /// s3 = aws.ec2.VpcEndpoint("s3",
    ///     vpc_id=aws_vpc["main"]["id"],
    ///     service_name="com.amazonaws.us-west-2.s3",
    ///     tags={
    ///         "Environment": "test",
    ///     })
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var s3 = new Aws.Ec2.VpcEndpoint("s3", new()
    ///     {
    ///         VpcId = aws_vpc.Main.Id,
    ///         ServiceName = "com.amazonaws.us-west-2.s3",
    ///         Tags = 
    ///         {
    ///             { "Environment", "test" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ```go
    /// package main
    /// 
    /// import (
    /// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
    /// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
    /// )
    /// 
    /// func main() {
    /// 	pulumi.Run(func(ctx *pulumi.Context) error {
    /// 		_, err := ec2.NewVpcEndpoint(ctx, "s3", &amp;ec2.VpcEndpointArgs{
    /// 			VpcId:       pulumi.Any(aws_vpc.Main.Id),
    /// 			ServiceName: pulumi.String("com.amazonaws.us-west-2.s3"),
    /// 			Tags: pulumi.StringMap{
    /// 				"Environment": pulumi.String("test"),
    /// 			},
    /// 		})
    /// 		if err != nil {
    /// 			return err
    /// 		}
    /// 		return nil
    /// 	})
    /// }
    /// ```
    /// ```java
    /// package generated_program;
    /// 
    /// import com.pulumi.Context;
    /// import com.pulumi.Pulumi;
    /// import com.pulumi.core.Output;
    /// import com.pulumi.aws.ec2.VpcEndpoint;
    /// import com.pulumi.aws.ec2.VpcEndpointArgs;
    /// import java.util.List;
    /// import java.util.ArrayList;
    /// import java.util.Map;
    /// import java.io.File;
    /// import java.nio.file.Files;
    /// import java.nio.file.Paths;
    /// 
    /// public class App {
    ///     public static void main(String[] args) {
    ///         Pulumi.run(App::stack);
    ///     }
    /// 
    ///     public static void stack(Context ctx) {
    ///         var s3 = new VpcEndpoint("s3", VpcEndpointArgs.builder()        
    ///             .vpcId(aws_vpc.main().id())
    ///             .serviceName("com.amazonaws.us-west-2.s3")
    ///             .tags(Map.of("Environment", "test"))
    ///             .build());
    /// 
    ///     }
    /// }
    /// ```
    /// ```yaml
    /// resources:
    ///   s3:
    ///     type: aws:ec2:VpcEndpoint
    ///     properties:
    ///       vpcId: ${aws_vpc.main.id}
    ///       serviceName: com.amazonaws.us-west-2.s3
    ///       tags:
    ///         Environment: test
    /// ```
    /// {{% /example %}}
    /// {{% example %}}
    /// ### Interface Endpoint Type
    /// 
    /// ```typescript
    /// import * as pulumi from "@pulumi/pulumi";
    /// import * as aws from "@pulumi/aws";
    /// 
    /// const ec2 = new aws.ec2.VpcEndpoint("ec2", {
    ///     vpcId: aws_vpc.main.id,
    ///     serviceName: "com.amazonaws.us-west-2.ec2",
    ///     vpcEndpointType: "Interface",
    ///     securityGroupIds: [aws_security_group.sg1.id],
    ///     privateDnsEnabled: true,
    /// });
    /// ```
    /// ```python
    /// import pulumi
    /// import pulumi_aws as aws
    /// 
    /// ec2 = aws.ec2.VpcEndpoint("ec2",
    ///     vpc_id=aws_vpc["main"]["id"],
    ///     service_name="com.amazonaws.us-west-2.ec2",
    ///     vpc_endpoint_type="Interface",
    ///     security_group_ids=[aws_security_group["sg1"]["id"]],
    ///     private_dns_enabled=True)
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ec2 = new Aws.Ec2.VpcEndpoint("ec2", new()
    ///     {
    ///         VpcId = aws_vpc.Main.Id,
    ///         ServiceName = "com.amazonaws.us-west-2.ec2",
    ///         VpcEndpointType = "Interface",
    ///         SecurityGroupIds = new[]
    ///         {
    ///             aws_security_group.Sg1.Id,
    ///         },
    ///         PrivateDnsEnabled = true,
    ///     });
    /// 
    /// });
    /// ```
    /// ```go
    /// package main
    /// 
    /// import (
    /// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
    /// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
    /// )
    /// 
    /// func main() {
    /// 	pulumi.Run(func(ctx *pulumi.Context) error {
    /// 		_, err := ec2.NewVpcEndpoint(ctx, "ec2", &amp;ec2.VpcEndpointArgs{
    /// 			VpcId:           pulumi.Any(aws_vpc.Main.Id),
    /// 			ServiceName:     pulumi.String("com.amazonaws.us-west-2.ec2"),
    /// 			VpcEndpointType: pulumi.String("Interface"),
    /// 			SecurityGroupIds: pulumi.StringArray{
    /// 				pulumi.Any(aws_security_group.Sg1.Id),
    /// 			},
    /// 			PrivateDnsEnabled: pulumi.Bool(true),
    /// 		})
    /// 		if err != nil {
    /// 			return err
    /// 		}
    /// 		return nil
    /// 	})
    /// }
    /// ```
    /// ```java
    /// package generated_program;
    /// 
    /// import com.pulumi.Context;
    /// import com.pulumi.Pulumi;
    /// import com.pulumi.core.Output;
    /// import com.pulumi.aws.ec2.VpcEndpoint;
    /// import com.pulumi.aws.ec2.VpcEndpointArgs;
    /// import java.util.List;
    /// import java.util.ArrayList;
    /// import java.util.Map;
    /// import java.io.File;
    /// import java.nio.file.Files;
    /// import java.nio.file.Paths;
    /// 
    /// public class App {
    ///     public static void main(String[] args) {
    ///         Pulumi.run(App::stack);
    ///     }
    /// 
    ///     public static void stack(Context ctx) {
    ///         var ec2 = new VpcEndpoint("ec2", VpcEndpointArgs.builder()        
    ///             .vpcId(aws_vpc.main().id())
    ///             .serviceName("com.amazonaws.us-west-2.ec2")
    ///             .vpcEndpointType("Interface")
    ///             .securityGroupIds(aws_security_group.sg1().id())
    ///             .privateDnsEnabled(true)
    ///             .build());
    /// 
    ///     }
    /// }
    /// ```
    /// ```yaml
    /// resources:
    ///   ec2:
    ///     type: aws:ec2:VpcEndpoint
    ///     properties:
    ///       vpcId: ${aws_vpc.main.id}
    ///       serviceName: com.amazonaws.us-west-2.ec2
    ///       vpcEndpointType: Interface
    ///       securityGroupIds:
    ///         - ${aws_security_group.sg1.id}
    ///       privateDnsEnabled: true
    /// ```
    /// {{% /example %}}
    /// {{% example %}}
    /// ### Gateway Load Balancer Endpoint Type
    /// 
    /// ```typescript
    /// import * as pulumi from "@pulumi/pulumi";
    /// import * as aws from "@pulumi/aws";
    /// 
    /// const current = aws.getCallerIdentity({});
    /// const exampleVpcEndpointService = new aws.ec2.VpcEndpointService("exampleVpcEndpointService", {
    ///     acceptanceRequired: false,
    ///     allowedPrincipals: [current.then(current =&gt; current.arn)],
    ///     gatewayLoadBalancerArns: [aws_lb.example.arn],
    /// });
    /// const exampleVpcEndpoint = new aws.ec2.VpcEndpoint("exampleVpcEndpoint", {
    ///     serviceName: exampleVpcEndpointService.serviceName,
    ///     subnetIds: [aws_subnet.example.id],
    ///     vpcEndpointType: exampleVpcEndpointService.serviceType,
    ///     vpcId: aws_vpc.example.id,
    /// });
    /// ```
    /// ```python
    /// import pulumi
    /// import pulumi_aws as aws
    /// 
    /// current = aws.get_caller_identity()
    /// example_vpc_endpoint_service = aws.ec2.VpcEndpointService("exampleVpcEndpointService",
    ///     acceptance_required=False,
    ///     allowed_principals=[current.arn],
    ///     gateway_load_balancer_arns=[aws_lb["example"]["arn"]])
    /// example_vpc_endpoint = aws.ec2.VpcEndpoint("exampleVpcEndpoint",
    ///     service_name=example_vpc_endpoint_service.service_name,
    ///     subnet_ids=[aws_subnet["example"]["id"]],
    ///     vpc_endpoint_type=example_vpc_endpoint_service.service_type,
    ///     vpc_id=aws_vpc["example"]["id"])
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var exampleVpcEndpointService = new Aws.Ec2.VpcEndpointService("exampleVpcEndpointService", new()
    ///     {
    ///         AcceptanceRequired = false,
    ///         AllowedPrincipals = new[]
    ///         {
    ///             current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.Arn),
    ///         },
    ///         GatewayLoadBalancerArns = new[]
    ///         {
    ///             aws_lb.Example.Arn,
    ///         },
    ///     });
    /// 
    ///     var exampleVpcEndpoint = new Aws.Ec2.VpcEndpoint("exampleVpcEndpoint", new()
    ///     {
    ///         ServiceName = exampleVpcEndpointService.ServiceName,
    ///         SubnetIds = new[]
    ///         {
    ///             aws_subnet.Example.Id,
    ///         },
    ///         VpcEndpointType = exampleVpcEndpointService.ServiceType,
    ///         VpcId = aws_vpc.Example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ```go
    /// package main
    /// 
    /// import (
    /// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
    /// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
    /// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
    /// )
    /// 
    /// func main() {
    /// 	pulumi.Run(func(ctx *pulumi.Context) error {
    /// 		current, err := aws.GetCallerIdentity(ctx, nil, nil)
    /// 		if err != nil {
    /// 			return err
    /// 		}
    /// 		exampleVpcEndpointService, err := ec2.NewVpcEndpointService(ctx, "exampleVpcEndpointService", &amp;ec2.VpcEndpointServiceArgs{
    /// 			AcceptanceRequired: pulumi.Bool(false),
    /// 			AllowedPrincipals: pulumi.StringArray{
    /// 				pulumi.String(current.Arn),
    /// 			},
    /// 			GatewayLoadBalancerArns: pulumi.StringArray{
    /// 				pulumi.Any(aws_lb.Example.Arn),
    /// 			},
    /// 		})
    /// 		if err != nil {
    /// 			return err
    /// 		}
    /// 		_, err = ec2.NewVpcEndpoint(ctx, "exampleVpcEndpoint", &amp;ec2.VpcEndpointArgs{
    /// 			ServiceName: exampleVpcEndpointService.ServiceName,
    /// 			SubnetIds: pulumi.StringArray{
    /// 				pulumi.Any(aws_subnet.Example.Id),
    /// 			},
    /// 			VpcEndpointType: exampleVpcEndpointService.ServiceType,
    /// 			VpcId:           pulumi.Any(aws_vpc.Example.Id),
    /// 		})
    /// 		if err != nil {
    /// 			return err
    /// 		}
    /// 		return nil
    /// 	})
    /// }
    /// ```
    /// ```java
    /// package generated_program;
    /// 
    /// import com.pulumi.Context;
    /// import com.pulumi.Pulumi;
    /// import com.pulumi.core.Output;
    /// import com.pulumi.aws.AwsFunctions;
    /// import com.pulumi.aws.ec2.VpcEndpointService;
    /// import com.pulumi.aws.ec2.VpcEndpointServiceArgs;
    /// import com.pulumi.aws.ec2.VpcEndpoint;
    /// import com.pulumi.aws.ec2.VpcEndpointArgs;
    /// import java.util.List;
    /// import java.util.ArrayList;
    /// import java.util.Map;
    /// import java.io.File;
    /// import java.nio.file.Files;
    /// import java.nio.file.Paths;
    /// 
    /// public class App {
    ///     public static void main(String[] args) {
    ///         Pulumi.run(App::stack);
    ///     }
    /// 
    ///     public static void stack(Context ctx) {
    ///         final var current = AwsFunctions.getCallerIdentity();
    /// 
    ///         var exampleVpcEndpointService = new VpcEndpointService("exampleVpcEndpointService", VpcEndpointServiceArgs.builder()        
    ///             .acceptanceRequired(false)
    ///             .allowedPrincipals(current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.arn()))
    ///             .gatewayLoadBalancerArns(aws_lb.example().arn())
    ///             .build());
    /// 
    ///         var exampleVpcEndpoint = new VpcEndpoint("exampleVpcEndpoint", VpcEndpointArgs.builder()        
    ///             .serviceName(exampleVpcEndpointService.serviceName())
    ///             .subnetIds(aws_subnet.example().id())
    ///             .vpcEndpointType(exampleVpcEndpointService.serviceType())
    ///             .vpcId(aws_vpc.example().id())
    ///             .build());
    /// 
    ///     }
    /// }
    /// ```
    /// ```yaml
    /// resources:
    ///   exampleVpcEndpointService:
    ///     type: aws:ec2:VpcEndpointService
    ///     properties:
    ///       acceptanceRequired: false
    ///       allowedPrincipals:
    ///         - ${current.arn}
    ///       gatewayLoadBalancerArns:
    ///         - ${aws_lb.example.arn}
    ///   exampleVpcEndpoint:
    ///     type: aws:ec2:VpcEndpoint
    ///     properties:
    ///       serviceName: ${exampleVpcEndpointService.serviceName}
    ///       subnetIds:
    ///         - ${aws_subnet.example.id}
    ///       vpcEndpointType: ${exampleVpcEndpointService.serviceType}
    ///       vpcId: ${aws_vpc.example.id}
    /// variables:
    ///   current:
    ///     Fn::Invoke:
    ///       Function: aws:getCallerIdentity
    ///       Arguments: {}
    /// ```
    /// {{% /example %}}
    /// {{% /examples %}}
    /// 
    /// ## Import
    /// 
    /// VPC Endpoints can be imported using the `vpc endpoint id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/vpcEndpoint:VpcEndpoint endpoint1 vpce-3ecf2a57
    /// ```
    /// 
    ///  
    /// </summary>
    public sealed class VpcEndpointSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
        /// </summary>
        [Input("autoAccept")]
        public bool? AutoAccept { get; set; }

        /// <summary>
        /// The DNS options for the endpoint. See dns_options below.
        /// </summary>
        [Input("dnsOptions")]
        public Input<Pulumi.Aws.Ec2.Inputs.VpcEndpointDnsOptionsArgs>? DnsOptions { get; set; }

        /// <summary>
        /// The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
        /// </summary>
        [Input("ipAddressType")]
        public Input<string>? IpAddressType { get; set; }

        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type Interface. Defaults to `false`.
        /// </summary>
        [Input("privateDnsEnabled")]
        public bool? PrivateDnsEnabled { get; set; }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// One or more route table IDs. Applicable for endpoints of type `Gateway`.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
        /// If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
        /// </summary>
        [Input("vpcEndpointType")]
        public Input<string>? VpcEndpointType { get; set; }

        public VpcEndpointSpecArgs()
        {
        }
        public static new VpcEndpointSpecArgs Empty => new VpcEndpointSpecArgs();
    }
}
