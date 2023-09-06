// Code generated by pulumi-gen-awsx DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ecs"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
	"github.com/pulumi/pulumi-awsx/sdk/v2/go/awsx/awsx"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Create a TaskDefinition resource with the given unique name, arguments, and options.
// Creates required log-group and task & execution roles.
// Presents required Service load balancers if target group included in port mappings.
type EC2TaskDefinition struct {
	pulumi.ResourceState

	// Auto-created IAM task execution role that the Amazon ECS container agent and the Docker daemon can assume.
	ExecutionRole iam.RoleOutput `pulumi:"executionRole"`
	// Computed load balancers from target groups specified of container port mappings.
	LoadBalancers ecs.ServiceLoadBalancerArrayOutput `pulumi:"loadBalancers"`
	// Auto-created Log Group resource for use by containers.
	LogGroup cloudwatch.LogGroupOutput `pulumi:"logGroup"`
	// Underlying ECS Task Definition resource
	TaskDefinition ecs.TaskDefinitionOutput `pulumi:"taskDefinition"`
	// Auto-created IAM role that allows your Amazon ECS container task to make calls to other AWS services.
	TaskRole iam.RoleOutput `pulumi:"taskRole"`
}

// NewEC2TaskDefinition registers a new resource with the given unique name, arguments, and options.
func NewEC2TaskDefinition(ctx *pulumi.Context,
	name string, args *EC2TaskDefinitionArgs, opts ...pulumi.ResourceOption) (*EC2TaskDefinition, error) {
	if args == nil {
		args = &EC2TaskDefinitionArgs{}
	}

	var resource EC2TaskDefinition
	err := ctx.RegisterRemoteComponentResource("awsx:ecs:EC2TaskDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type ec2taskDefinitionArgs struct {
	// Single container to make a TaskDefinition from.  Useful for simple cases where there aren't
	// multiple containers, especially when creating a TaskDefinition to call [run] on.
	//
	// Either [container] or [containers] must be provided.
	Container *TaskDefinitionContainerDefinition `pulumi:"container"`
	// All the containers to make a TaskDefinition from.  Useful when creating a Service that will
	// contain many containers within.
	//
	// Either [container] or [containers] must be provided.
	Containers map[string]TaskDefinitionContainerDefinition `pulumi:"containers"`
	// The number of cpu units used by the task. If not provided, a default will be computed based on the cumulative needs specified by [containerDefinitions]
	Cpu *string `pulumi:"cpu"`
	// The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
	EphemeralStorage *ecs.TaskDefinitionEphemeralStorage `pulumi:"ephemeralStorage"`
	// The execution role that the Amazon ECS container agent and the Docker daemon can assume.
	// Will be created automatically if not defined.
	ExecutionRole *awsx.DefaultRoleWithPolicy `pulumi:"executionRole"`
	// An optional unique name for your task definition. If not specified, then a default will be created.
	Family *string `pulumi:"family"`
	// Configuration block(s) with Inference Accelerators settings. Detailed below.
	InferenceAccelerators []ecs.TaskDefinitionInferenceAccelerator `pulumi:"inferenceAccelerators"`
	// IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
	IpcMode *string `pulumi:"ipcMode"`
	// A set of volume blocks that containers in your task may use.
	LogGroup *awsx.DefaultLogGroup `pulumi:"logGroup"`
	// The amount (in MiB) of memory used by the task.  If not provided, a default will be computed
	// based on the cumulative needs specified by [containerDefinitions]
	Memory *string `pulumi:"memory"`
	// Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
	NetworkMode *string `pulumi:"networkMode"`
	// Process namespace to use for the containers in the task. The valid values are `host` and `task`.
	PidMode *string `pulumi:"pidMode"`
	// Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
	PlacementConstraints []ecs.TaskDefinitionPlacementConstraint `pulumi:"placementConstraints"`
	// Configuration block for the App Mesh proxy. Detailed below.
	ProxyConfiguration *ecs.TaskDefinitionProxyConfiguration `pulumi:"proxyConfiguration"`
	// Configuration block for runtime_platform that containers in your task may use.
	RuntimePlatform *ecs.TaskDefinitionRuntimePlatform `pulumi:"runtimePlatform"`
	// Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
	SkipDestroy *bool `pulumi:"skipDestroy"`
	// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// IAM role that allows your Amazon ECS container task to make calls to other AWS services.
	// Will be created automatically if not defined.
	TaskRole *awsx.DefaultRoleWithPolicy `pulumi:"taskRole"`
	// Configuration block for volumes that containers in your task may use. Detailed below.
	Volumes []ecs.TaskDefinitionVolume `pulumi:"volumes"`
}

// The set of arguments for constructing a EC2TaskDefinition resource.
type EC2TaskDefinitionArgs struct {
	// Single container to make a TaskDefinition from.  Useful for simple cases where there aren't
	// multiple containers, especially when creating a TaskDefinition to call [run] on.
	//
	// Either [container] or [containers] must be provided.
	Container *TaskDefinitionContainerDefinitionArgs
	// All the containers to make a TaskDefinition from.  Useful when creating a Service that will
	// contain many containers within.
	//
	// Either [container] or [containers] must be provided.
	Containers map[string]TaskDefinitionContainerDefinitionArgs
	// The number of cpu units used by the task. If not provided, a default will be computed based on the cumulative needs specified by [containerDefinitions]
	Cpu pulumi.StringPtrInput
	// The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
	EphemeralStorage ecs.TaskDefinitionEphemeralStoragePtrInput
	// The execution role that the Amazon ECS container agent and the Docker daemon can assume.
	// Will be created automatically if not defined.
	ExecutionRole *awsx.DefaultRoleWithPolicyArgs
	// An optional unique name for your task definition. If not specified, then a default will be created.
	Family pulumi.StringPtrInput
	// Configuration block(s) with Inference Accelerators settings. Detailed below.
	InferenceAccelerators ecs.TaskDefinitionInferenceAcceleratorArrayInput
	// IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
	IpcMode pulumi.StringPtrInput
	// A set of volume blocks that containers in your task may use.
	LogGroup *awsx.DefaultLogGroupArgs
	// The amount (in MiB) of memory used by the task.  If not provided, a default will be computed
	// based on the cumulative needs specified by [containerDefinitions]
	Memory pulumi.StringPtrInput
	// Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
	NetworkMode pulumi.StringPtrInput
	// Process namespace to use for the containers in the task. The valid values are `host` and `task`.
	PidMode pulumi.StringPtrInput
	// Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
	PlacementConstraints ecs.TaskDefinitionPlacementConstraintArrayInput
	// Configuration block for the App Mesh proxy. Detailed below.
	ProxyConfiguration ecs.TaskDefinitionProxyConfigurationPtrInput
	// Configuration block for runtime_platform that containers in your task may use.
	RuntimePlatform ecs.TaskDefinitionRuntimePlatformPtrInput
	// Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
	SkipDestroy pulumi.BoolPtrInput
	// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// IAM role that allows your Amazon ECS container task to make calls to other AWS services.
	// Will be created automatically if not defined.
	TaskRole *awsx.DefaultRoleWithPolicyArgs
	// Configuration block for volumes that containers in your task may use. Detailed below.
	Volumes ecs.TaskDefinitionVolumeArrayInput
}

func (EC2TaskDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ec2taskDefinitionArgs)(nil)).Elem()
}

type EC2TaskDefinitionInput interface {
	pulumi.Input

	ToEC2TaskDefinitionOutput() EC2TaskDefinitionOutput
	ToEC2TaskDefinitionOutputWithContext(ctx context.Context) EC2TaskDefinitionOutput
}

func (*EC2TaskDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**EC2TaskDefinition)(nil)).Elem()
}

func (i *EC2TaskDefinition) ToEC2TaskDefinitionOutput() EC2TaskDefinitionOutput {
	return i.ToEC2TaskDefinitionOutputWithContext(context.Background())
}

func (i *EC2TaskDefinition) ToEC2TaskDefinitionOutputWithContext(ctx context.Context) EC2TaskDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EC2TaskDefinitionOutput)
}

// EC2TaskDefinitionArrayInput is an input type that accepts EC2TaskDefinitionArray and EC2TaskDefinitionArrayOutput values.
// You can construct a concrete instance of `EC2TaskDefinitionArrayInput` via:
//
//	EC2TaskDefinitionArray{ EC2TaskDefinitionArgs{...} }
type EC2TaskDefinitionArrayInput interface {
	pulumi.Input

	ToEC2TaskDefinitionArrayOutput() EC2TaskDefinitionArrayOutput
	ToEC2TaskDefinitionArrayOutputWithContext(context.Context) EC2TaskDefinitionArrayOutput
}

type EC2TaskDefinitionArray []EC2TaskDefinitionInput

func (EC2TaskDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EC2TaskDefinition)(nil)).Elem()
}

func (i EC2TaskDefinitionArray) ToEC2TaskDefinitionArrayOutput() EC2TaskDefinitionArrayOutput {
	return i.ToEC2TaskDefinitionArrayOutputWithContext(context.Background())
}

func (i EC2TaskDefinitionArray) ToEC2TaskDefinitionArrayOutputWithContext(ctx context.Context) EC2TaskDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EC2TaskDefinitionArrayOutput)
}

// EC2TaskDefinitionMapInput is an input type that accepts EC2TaskDefinitionMap and EC2TaskDefinitionMapOutput values.
// You can construct a concrete instance of `EC2TaskDefinitionMapInput` via:
//
//	EC2TaskDefinitionMap{ "key": EC2TaskDefinitionArgs{...} }
type EC2TaskDefinitionMapInput interface {
	pulumi.Input

	ToEC2TaskDefinitionMapOutput() EC2TaskDefinitionMapOutput
	ToEC2TaskDefinitionMapOutputWithContext(context.Context) EC2TaskDefinitionMapOutput
}

type EC2TaskDefinitionMap map[string]EC2TaskDefinitionInput

func (EC2TaskDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EC2TaskDefinition)(nil)).Elem()
}

func (i EC2TaskDefinitionMap) ToEC2TaskDefinitionMapOutput() EC2TaskDefinitionMapOutput {
	return i.ToEC2TaskDefinitionMapOutputWithContext(context.Background())
}

func (i EC2TaskDefinitionMap) ToEC2TaskDefinitionMapOutputWithContext(ctx context.Context) EC2TaskDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EC2TaskDefinitionMapOutput)
}

type EC2TaskDefinitionOutput struct{ *pulumi.OutputState }

func (EC2TaskDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EC2TaskDefinition)(nil)).Elem()
}

func (o EC2TaskDefinitionOutput) ToEC2TaskDefinitionOutput() EC2TaskDefinitionOutput {
	return o
}

func (o EC2TaskDefinitionOutput) ToEC2TaskDefinitionOutputWithContext(ctx context.Context) EC2TaskDefinitionOutput {
	return o
}

// Auto-created IAM task execution role that the Amazon ECS container agent and the Docker daemon can assume.
func (o EC2TaskDefinitionOutput) ExecutionRole() iam.RoleOutput {
	return o.ApplyT(func(v *EC2TaskDefinition) iam.RoleOutput { return v.ExecutionRole }).(iam.RoleOutput)
}

// Computed load balancers from target groups specified of container port mappings.
func (o EC2TaskDefinitionOutput) LoadBalancers() ecs.ServiceLoadBalancerArrayOutput {
	return o.ApplyT(func(v *EC2TaskDefinition) ecs.ServiceLoadBalancerArrayOutput { return v.LoadBalancers }).(ecs.ServiceLoadBalancerArrayOutput)
}

// Auto-created Log Group resource for use by containers.
func (o EC2TaskDefinitionOutput) LogGroup() cloudwatch.LogGroupOutput {
	return o.ApplyT(func(v *EC2TaskDefinition) cloudwatch.LogGroupOutput { return v.LogGroup }).(cloudwatch.LogGroupOutput)
}

// Underlying ECS Task Definition resource
func (o EC2TaskDefinitionOutput) TaskDefinition() ecs.TaskDefinitionOutput {
	return o.ApplyT(func(v *EC2TaskDefinition) ecs.TaskDefinitionOutput { return v.TaskDefinition }).(ecs.TaskDefinitionOutput)
}

// Auto-created IAM role that allows your Amazon ECS container task to make calls to other AWS services.
func (o EC2TaskDefinitionOutput) TaskRole() iam.RoleOutput {
	return o.ApplyT(func(v *EC2TaskDefinition) iam.RoleOutput { return v.TaskRole }).(iam.RoleOutput)
}

type EC2TaskDefinitionArrayOutput struct{ *pulumi.OutputState }

func (EC2TaskDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EC2TaskDefinition)(nil)).Elem()
}

func (o EC2TaskDefinitionArrayOutput) ToEC2TaskDefinitionArrayOutput() EC2TaskDefinitionArrayOutput {
	return o
}

func (o EC2TaskDefinitionArrayOutput) ToEC2TaskDefinitionArrayOutputWithContext(ctx context.Context) EC2TaskDefinitionArrayOutput {
	return o
}

func (o EC2TaskDefinitionArrayOutput) Index(i pulumi.IntInput) EC2TaskDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EC2TaskDefinition {
		return vs[0].([]*EC2TaskDefinition)[vs[1].(int)]
	}).(EC2TaskDefinitionOutput)
}

type EC2TaskDefinitionMapOutput struct{ *pulumi.OutputState }

func (EC2TaskDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EC2TaskDefinition)(nil)).Elem()
}

func (o EC2TaskDefinitionMapOutput) ToEC2TaskDefinitionMapOutput() EC2TaskDefinitionMapOutput {
	return o
}

func (o EC2TaskDefinitionMapOutput) ToEC2TaskDefinitionMapOutputWithContext(ctx context.Context) EC2TaskDefinitionMapOutput {
	return o
}

func (o EC2TaskDefinitionMapOutput) MapIndex(k pulumi.StringInput) EC2TaskDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EC2TaskDefinition {
		return vs[0].(map[string]*EC2TaskDefinition)[vs[1].(string)]
	}).(EC2TaskDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EC2TaskDefinitionInput)(nil)).Elem(), &EC2TaskDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*EC2TaskDefinitionArrayInput)(nil)).Elem(), EC2TaskDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EC2TaskDefinitionMapInput)(nil)).Elem(), EC2TaskDefinitionMap{})
	pulumi.RegisterOutputType(EC2TaskDefinitionOutput{})
	pulumi.RegisterOutputType(EC2TaskDefinitionArrayOutput{})
	pulumi.RegisterOutputType(EC2TaskDefinitionMapOutput{})
}
