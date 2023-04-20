# coding=utf-8
# *** WARNING: this file was generated by pulumi-gen-awsx. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from ._enums import *
import pulumi_aws

__all__ = [
    'NatGatewayConfigurationArgs',
    'SubnetSpecArgs',
    'VpcEndpointSpecArgs',
]

@pulumi.input_type
class NatGatewayConfigurationArgs:
    def __init__(__self__, *,
                 strategy: 'NatGatewayStrategy',
                 elastic_ip_allocation_ids: Optional[Sequence[pulumi.Input[str]]] = None):
        """
        Configuration for NAT Gateways.
        :param 'NatGatewayStrategy' strategy: The strategy for deploying NAT Gateways.
        :param Sequence[pulumi.Input[str]] elastic_ip_allocation_ids: A list of EIP allocation IDs to assign to the NAT Gateways. Optional. If specified, the number of supplied values must match the chosen strategy (either one, or the number of availability zones).
        """
        pulumi.set(__self__, "strategy", strategy)
        if elastic_ip_allocation_ids is not None:
            pulumi.set(__self__, "elastic_ip_allocation_ids", elastic_ip_allocation_ids)

    @property
    @pulumi.getter
    def strategy(self) -> 'NatGatewayStrategy':
        """
        The strategy for deploying NAT Gateways.
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: 'NatGatewayStrategy'):
        pulumi.set(self, "strategy", value)

    @property
    @pulumi.getter(name="elasticIpAllocationIds")
    def elastic_ip_allocation_ids(self) -> Optional[Sequence[pulumi.Input[str]]]:
        """
        A list of EIP allocation IDs to assign to the NAT Gateways. Optional. If specified, the number of supplied values must match the chosen strategy (either one, or the number of availability zones).
        """
        return pulumi.get(self, "elastic_ip_allocation_ids")

    @elastic_ip_allocation_ids.setter
    def elastic_ip_allocation_ids(self, value: Optional[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "elastic_ip_allocation_ids", value)


@pulumi.input_type
class SubnetSpecArgs:
    def __init__(__self__, *,
                 type: 'SubnetType',
                 cidr_mask: Optional[int] = None,
                 name: Optional[str] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Configuration for a VPC subnet.
        :param 'SubnetType' type: The type of subnet.
        :param int cidr_mask: The bitmask for the subnet's CIDR block.
        :param str name: The subnet's name. Will be templated upon creation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        """
        pulumi.set(__self__, "type", type)
        if cidr_mask is not None:
            pulumi.set(__self__, "cidr_mask", cidr_mask)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def type(self) -> 'SubnetType':
        """
        The type of subnet.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: 'SubnetType'):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="cidrMask")
    def cidr_mask(self) -> Optional[int]:
        """
        The bitmask for the subnet's CIDR block.
        """
        return pulumi.get(self, "cidr_mask")

    @cidr_mask.setter
    def cidr_mask(self, value: Optional[int]):
        pulumi.set(self, "cidr_mask", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The subnet's name. Will be templated upon creation.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class VpcEndpointSpecArgs:
    def __init__(__self__, *,
                 service_name: str,
                 auto_accept: Optional[bool] = None,
                 dns_options: Optional[pulumi.Input['pulumi_aws.ec2.VpcEndpointDnsOptionsArgs']] = None,
                 ip_address_type: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 private_dns_enabled: Optional[bool] = None,
                 route_table_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_endpoint_type: Optional[pulumi.Input[str]] = None):
        """
        {{% examples %}}
        ## Example Usage
        {{% example %}}
        ### Basic

        ```typescript
        import * as pulumi from "@pulumi/pulumi";
        import * as aws from "@pulumi/aws";

        const s3 = new aws.ec2.VpcEndpoint("s3", {
            vpcId: aws_vpc.main.id,
            serviceName: "com.amazonaws.us-west-2.s3",
        });
        ```
        ```python
        import pulumi
        import pulumi_aws as aws

        s3 = aws.ec2.VpcEndpoint("s3",
            vpc_id=aws_vpc["main"]["id"],
            service_name="com.amazonaws.us-west-2.s3")
        ```
        ```csharp
        using System.Collections.Generic;
        using Pulumi;
        using Aws = Pulumi.Aws;

        return await Deployment.RunAsync(() => 
        {
            var s3 = new Aws.Ec2.VpcEndpoint("s3", new()
            {
                VpcId = aws_vpc.Main.Id,
                ServiceName = "com.amazonaws.us-west-2.s3",
            });

        });
        ```
        ```go
        package main

        import (
        	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
        	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
        )

        func main() {
        	pulumi.Run(func(ctx *pulumi.Context) error {
        		_, err := ec2.NewVpcEndpoint(ctx, "s3", &ec2.VpcEndpointArgs{
        			VpcId:       pulumi.Any(aws_vpc.Main.Id),
        			ServiceName: pulumi.String("com.amazonaws.us-west-2.s3"),
        		})
        		if err != nil {
        			return err
        		}
        		return nil
        	})
        }
        ```
        ```java
        package generated_program;

        import com.pulumi.Context;
        import com.pulumi.Pulumi;
        import com.pulumi.core.Output;
        import com.pulumi.aws.ec2.VpcEndpoint;
        import com.pulumi.aws.ec2.VpcEndpointArgs;
        import java.util.List;
        import java.util.ArrayList;
        import java.util.Map;
        import java.io.File;
        import java.nio.file.Files;
        import java.nio.file.Paths;

        public class App {
            public static void main(String[] args) {
                Pulumi.run(App::stack);
            }

            public static void stack(Context ctx) {
                var s3 = new VpcEndpoint("s3", VpcEndpointArgs.builder()        
                    .vpcId(aws_vpc.main().id())
                    .serviceName("com.amazonaws.us-west-2.s3")
                    .build());

            }
        }
        ```
        ```yaml
        resources:
          s3:
            type: aws:ec2:VpcEndpoint
            properties:
              vpcId: ${aws_vpc.main.id}
              serviceName: com.amazonaws.us-west-2.s3
        ```
        {{% /example %}}
        {{% example %}}
        ### Basic w/ Tags

        ```typescript
        import * as pulumi from "@pulumi/pulumi";
        import * as aws from "@pulumi/aws";

        const s3 = new aws.ec2.VpcEndpoint("s3", {
            vpcId: aws_vpc.main.id,
            serviceName: "com.amazonaws.us-west-2.s3",
            tags: {
                Environment: "test",
            },
        });
        ```
        ```python
        import pulumi
        import pulumi_aws as aws

        s3 = aws.ec2.VpcEndpoint("s3",
            vpc_id=aws_vpc["main"]["id"],
            service_name="com.amazonaws.us-west-2.s3",
            tags={
                "Environment": "test",
            })
        ```
        ```csharp
        using System.Collections.Generic;
        using Pulumi;
        using Aws = Pulumi.Aws;

        return await Deployment.RunAsync(() => 
        {
            var s3 = new Aws.Ec2.VpcEndpoint("s3", new()
            {
                VpcId = aws_vpc.Main.Id,
                ServiceName = "com.amazonaws.us-west-2.s3",
                Tags = 
                {
                    { "Environment", "test" },
                },
            });

        });
        ```
        ```go
        package main

        import (
        	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
        	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
        )

        func main() {
        	pulumi.Run(func(ctx *pulumi.Context) error {
        		_, err := ec2.NewVpcEndpoint(ctx, "s3", &ec2.VpcEndpointArgs{
        			VpcId:       pulumi.Any(aws_vpc.Main.Id),
        			ServiceName: pulumi.String("com.amazonaws.us-west-2.s3"),
        			Tags: pulumi.StringMap{
        				"Environment": pulumi.String("test"),
        			},
        		})
        		if err != nil {
        			return err
        		}
        		return nil
        	})
        }
        ```
        ```java
        package generated_program;

        import com.pulumi.Context;
        import com.pulumi.Pulumi;
        import com.pulumi.core.Output;
        import com.pulumi.aws.ec2.VpcEndpoint;
        import com.pulumi.aws.ec2.VpcEndpointArgs;
        import java.util.List;
        import java.util.ArrayList;
        import java.util.Map;
        import java.io.File;
        import java.nio.file.Files;
        import java.nio.file.Paths;

        public class App {
            public static void main(String[] args) {
                Pulumi.run(App::stack);
            }

            public static void stack(Context ctx) {
                var s3 = new VpcEndpoint("s3", VpcEndpointArgs.builder()        
                    .vpcId(aws_vpc.main().id())
                    .serviceName("com.amazonaws.us-west-2.s3")
                    .tags(Map.of("Environment", "test"))
                    .build());

            }
        }
        ```
        ```yaml
        resources:
          s3:
            type: aws:ec2:VpcEndpoint
            properties:
              vpcId: ${aws_vpc.main.id}
              serviceName: com.amazonaws.us-west-2.s3
              tags:
                Environment: test
        ```
        {{% /example %}}
        {{% example %}}
        ### Interface Endpoint Type

        ```typescript
        import * as pulumi from "@pulumi/pulumi";
        import * as aws from "@pulumi/aws";

        const ec2 = new aws.ec2.VpcEndpoint("ec2", {
            vpcId: aws_vpc.main.id,
            serviceName: "com.amazonaws.us-west-2.ec2",
            vpcEndpointType: "Interface",
            securityGroupIds: [aws_security_group.sg1.id],
            privateDnsEnabled: true,
        });
        ```
        ```python
        import pulumi
        import pulumi_aws as aws

        ec2 = aws.ec2.VpcEndpoint("ec2",
            vpc_id=aws_vpc["main"]["id"],
            service_name="com.amazonaws.us-west-2.ec2",
            vpc_endpoint_type="Interface",
            security_group_ids=[aws_security_group["sg1"]["id"]],
            private_dns_enabled=True)
        ```
        ```csharp
        using System.Collections.Generic;
        using Pulumi;
        using Aws = Pulumi.Aws;

        return await Deployment.RunAsync(() => 
        {
            var ec2 = new Aws.Ec2.VpcEndpoint("ec2", new()
            {
                VpcId = aws_vpc.Main.Id,
                ServiceName = "com.amazonaws.us-west-2.ec2",
                VpcEndpointType = "Interface",
                SecurityGroupIds = new[]
                {
                    aws_security_group.Sg1.Id,
                },
                PrivateDnsEnabled = true,
            });

        });
        ```
        ```go
        package main

        import (
        	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
        	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
        )

        func main() {
        	pulumi.Run(func(ctx *pulumi.Context) error {
        		_, err := ec2.NewVpcEndpoint(ctx, "ec2", &ec2.VpcEndpointArgs{
        			VpcId:           pulumi.Any(aws_vpc.Main.Id),
        			ServiceName:     pulumi.String("com.amazonaws.us-west-2.ec2"),
        			VpcEndpointType: pulumi.String("Interface"),
        			SecurityGroupIds: pulumi.StringArray{
        				pulumi.Any(aws_security_group.Sg1.Id),
        			},
        			PrivateDnsEnabled: pulumi.Bool(true),
        		})
        		if err != nil {
        			return err
        		}
        		return nil
        	})
        }
        ```
        ```java
        package generated_program;

        import com.pulumi.Context;
        import com.pulumi.Pulumi;
        import com.pulumi.core.Output;
        import com.pulumi.aws.ec2.VpcEndpoint;
        import com.pulumi.aws.ec2.VpcEndpointArgs;
        import java.util.List;
        import java.util.ArrayList;
        import java.util.Map;
        import java.io.File;
        import java.nio.file.Files;
        import java.nio.file.Paths;

        public class App {
            public static void main(String[] args) {
                Pulumi.run(App::stack);
            }

            public static void stack(Context ctx) {
                var ec2 = new VpcEndpoint("ec2", VpcEndpointArgs.builder()        
                    .vpcId(aws_vpc.main().id())
                    .serviceName("com.amazonaws.us-west-2.ec2")
                    .vpcEndpointType("Interface")
                    .securityGroupIds(aws_security_group.sg1().id())
                    .privateDnsEnabled(true)
                    .build());

            }
        }
        ```
        ```yaml
        resources:
          ec2:
            type: aws:ec2:VpcEndpoint
            properties:
              vpcId: ${aws_vpc.main.id}
              serviceName: com.amazonaws.us-west-2.ec2
              vpcEndpointType: Interface
              securityGroupIds:
                - ${aws_security_group.sg1.id}
              privateDnsEnabled: true
        ```
        {{% /example %}}
        {{% example %}}
        ### Gateway Load Balancer Endpoint Type

        ```typescript
        import * as pulumi from "@pulumi/pulumi";
        import * as aws from "@pulumi/aws";

        const current = aws.getCallerIdentity({});
        const exampleVpcEndpointService = new aws.ec2.VpcEndpointService("exampleVpcEndpointService", {
            acceptanceRequired: false,
            allowedPrincipals: [current.then(current => current.arn)],
            gatewayLoadBalancerArns: [aws_lb.example.arn],
        });
        const exampleVpcEndpoint = new aws.ec2.VpcEndpoint("exampleVpcEndpoint", {
            serviceName: exampleVpcEndpointService.serviceName,
            subnetIds: [aws_subnet.example.id],
            vpcEndpointType: exampleVpcEndpointService.serviceType,
            vpcId: aws_vpc.example.id,
        });
        ```
        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.get_caller_identity()
        example_vpc_endpoint_service = aws.ec2.VpcEndpointService("exampleVpcEndpointService",
            acceptance_required=False,
            allowed_principals=[current.arn],
            gateway_load_balancer_arns=[aws_lb["example"]["arn"]])
        example_vpc_endpoint = aws.ec2.VpcEndpoint("exampleVpcEndpoint",
            service_name=example_vpc_endpoint_service.service_name,
            subnet_ids=[aws_subnet["example"]["id"]],
            vpc_endpoint_type=example_vpc_endpoint_service.service_type,
            vpc_id=aws_vpc["example"]["id"])
        ```
        ```csharp
        using System.Collections.Generic;
        using Pulumi;
        using Aws = Pulumi.Aws;

        return await Deployment.RunAsync(() => 
        {
            var current = Aws.GetCallerIdentity.Invoke();

            var exampleVpcEndpointService = new Aws.Ec2.VpcEndpointService("exampleVpcEndpointService", new()
            {
                AcceptanceRequired = false,
                AllowedPrincipals = new[]
                {
                    current.Apply(getCallerIdentityResult => getCallerIdentityResult.Arn),
                },
                GatewayLoadBalancerArns = new[]
                {
                    aws_lb.Example.Arn,
                },
            });

            var exampleVpcEndpoint = new Aws.Ec2.VpcEndpoint("exampleVpcEndpoint", new()
            {
                ServiceName = exampleVpcEndpointService.ServiceName,
                SubnetIds = new[]
                {
                    aws_subnet.Example.Id,
                },
                VpcEndpointType = exampleVpcEndpointService.ServiceType,
                VpcId = aws_vpc.Example.Id,
            });

        });
        ```
        ```go
        package main

        import (
        	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
        	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
        	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
        )

        func main() {
        	pulumi.Run(func(ctx *pulumi.Context) error {
        		current, err := aws.GetCallerIdentity(ctx, nil, nil)
        		if err != nil {
        			return err
        		}
        		exampleVpcEndpointService, err := ec2.NewVpcEndpointService(ctx, "exampleVpcEndpointService", &ec2.VpcEndpointServiceArgs{
        			AcceptanceRequired: pulumi.Bool(false),
        			AllowedPrincipals: pulumi.StringArray{
        				pulumi.String(current.Arn),
        			},
        			GatewayLoadBalancerArns: pulumi.StringArray{
        				pulumi.Any(aws_lb.Example.Arn),
        			},
        		})
        		if err != nil {
        			return err
        		}
        		_, err = ec2.NewVpcEndpoint(ctx, "exampleVpcEndpoint", &ec2.VpcEndpointArgs{
        			ServiceName: exampleVpcEndpointService.ServiceName,
        			SubnetIds: pulumi.StringArray{
        				pulumi.Any(aws_subnet.Example.Id),
        			},
        			VpcEndpointType: exampleVpcEndpointService.ServiceType,
        			VpcId:           pulumi.Any(aws_vpc.Example.Id),
        		})
        		if err != nil {
        			return err
        		}
        		return nil
        	})
        }
        ```
        ```java
        package generated_program;

        import com.pulumi.Context;
        import com.pulumi.Pulumi;
        import com.pulumi.core.Output;
        import com.pulumi.aws.AwsFunctions;
        import com.pulumi.aws.ec2.VpcEndpointService;
        import com.pulumi.aws.ec2.VpcEndpointServiceArgs;
        import com.pulumi.aws.ec2.VpcEndpoint;
        import com.pulumi.aws.ec2.VpcEndpointArgs;
        import java.util.List;
        import java.util.ArrayList;
        import java.util.Map;
        import java.io.File;
        import java.nio.file.Files;
        import java.nio.file.Paths;

        public class App {
            public static void main(String[] args) {
                Pulumi.run(App::stack);
            }

            public static void stack(Context ctx) {
                final var current = AwsFunctions.getCallerIdentity();

                var exampleVpcEndpointService = new VpcEndpointService("exampleVpcEndpointService", VpcEndpointServiceArgs.builder()        
                    .acceptanceRequired(false)
                    .allowedPrincipals(current.applyValue(getCallerIdentityResult -> getCallerIdentityResult.arn()))
                    .gatewayLoadBalancerArns(aws_lb.example().arn())
                    .build());

                var exampleVpcEndpoint = new VpcEndpoint("exampleVpcEndpoint", VpcEndpointArgs.builder()        
                    .serviceName(exampleVpcEndpointService.serviceName())
                    .subnetIds(aws_subnet.example().id())
                    .vpcEndpointType(exampleVpcEndpointService.serviceType())
                    .vpcId(aws_vpc.example().id())
                    .build());

            }
        }
        ```
        ```yaml
        resources:
          exampleVpcEndpointService:
            type: aws:ec2:VpcEndpointService
            properties:
              acceptanceRequired: false
              allowedPrincipals:
                - ${current.arn}
              gatewayLoadBalancerArns:
                - ${aws_lb.example.arn}
          exampleVpcEndpoint:
            type: aws:ec2:VpcEndpoint
            properties:
              serviceName: ${exampleVpcEndpointService.serviceName}
              subnetIds:
                - ${aws_subnet.example.id}
              vpcEndpointType: ${exampleVpcEndpointService.serviceType}
              vpcId: ${aws_vpc.example.id}
        variables:
          current:
            Fn::Invoke:
              Function: aws:getCallerIdentity
              Arguments: {}
        ```
        {{% /example %}}
        {{% /examples %}}

        ## Import

        VPC Endpoints can be imported using the `vpc endpoint id`, e.g.,

        ```sh
         $ pulumi import aws:ec2/vpcEndpoint:VpcEndpoint endpoint1 vpce-3ecf2a57
        ```

         
        :param str service_name: The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
        :param bool auto_accept: Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
        :param pulumi.Input['pulumi_aws.ec2.VpcEndpointDnsOptionsArgs'] dns_options: The DNS options for the endpoint. See dns_options below.
        :param pulumi.Input[str] ip_address_type: The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
        :param pulumi.Input[str] policy: A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        :param bool private_dns_enabled: Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type Interface. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] route_table_ids: One or more route table IDs. Applicable for endpoints of type `Gateway`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
               If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_endpoint_type: The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
        """
        pulumi.set(__self__, "service_name", service_name)
        if auto_accept is not None:
            pulumi.set(__self__, "auto_accept", auto_accept)
        if dns_options is not None:
            pulumi.set(__self__, "dns_options", dns_options)
        if ip_address_type is not None:
            pulumi.set(__self__, "ip_address_type", ip_address_type)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if private_dns_enabled is not None:
            pulumi.set(__self__, "private_dns_enabled", private_dns_enabled)
        if route_table_ids is not None:
            pulumi.set(__self__, "route_table_ids", route_table_ids)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_endpoint_type is not None:
            pulumi.set(__self__, "vpc_endpoint_type", vpc_endpoint_type)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        """
        The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: str):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="autoAccept")
    def auto_accept(self) -> Optional[bool]:
        """
        Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
        """
        return pulumi.get(self, "auto_accept")

    @auto_accept.setter
    def auto_accept(self, value: Optional[bool]):
        pulumi.set(self, "auto_accept", value)

    @property
    @pulumi.getter(name="dnsOptions")
    def dns_options(self) -> Optional[pulumi.Input['pulumi_aws.ec2.VpcEndpointDnsOptionsArgs']]:
        """
        The DNS options for the endpoint. See dns_options below.
        """
        return pulumi.get(self, "dns_options")

    @dns_options.setter
    def dns_options(self, value: Optional[pulumi.Input['pulumi_aws.ec2.VpcEndpointDnsOptionsArgs']]):
        pulumi.set(self, "dns_options", value)

    @property
    @pulumi.getter(name="ipAddressType")
    def ip_address_type(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
        """
        return pulumi.get(self, "ip_address_type")

    @ip_address_type.setter
    def ip_address_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address_type", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="privateDnsEnabled")
    def private_dns_enabled(self) -> Optional[bool]:
        """
        Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type Interface. Defaults to `false`.
        """
        return pulumi.get(self, "private_dns_enabled")

    @private_dns_enabled.setter
    def private_dns_enabled(self, value: Optional[bool]):
        pulumi.set(self, "private_dns_enabled", value)

    @property
    @pulumi.getter(name="routeTableIds")
    def route_table_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more route table IDs. Applicable for endpoints of type `Gateway`.
        """
        return pulumi.get(self, "route_table_ids")

    @route_table_ids.setter
    def route_table_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "route_table_ids", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
        If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcEndpointType")
    def vpc_endpoint_type(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
        """
        return pulumi.get(self, "vpc_endpoint_type")

    @vpc_endpoint_type.setter
    def vpc_endpoint_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_type", value)


