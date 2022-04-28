// Code generated by pulumi-gen-awsx DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-awsx/sdk/go/awsx"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "awsx:ecs:EC2Service":
		r = &EC2Service{}
	case "awsx:ecs:EC2TaskDefinition":
		r = &EC2TaskDefinition{}
	case "awsx:ecs:FargateService":
		r = &FargateService{}
	case "awsx:ecs:FargateTaskDefinition":
		r = &FargateTaskDefinition{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := awsx.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"awsx",
		"ecs",
		&module{version},
	)
}
