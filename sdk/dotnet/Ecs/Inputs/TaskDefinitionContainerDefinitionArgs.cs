// *** WARNING: this file was generated by pulumi-gen-awsx. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Awsx.Ecs.Inputs
{

    /// <summary>
    /// List of container definitions that are passed to the Docker daemon on a container instance
    /// </summary>
    public sealed class TaskDefinitionContainerDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("command")]
        private InputList<string>? _command;
        public InputList<string> Command
        {
            get => _command ?? (_command = new InputList<string>());
            set => _command = value;
        }

        [Input("cpu")]
        public Input<int>? Cpu { get; set; }

        [Input("dependsOn")]
        private InputList<Inputs.TaskDefinitionContainerDependencyArgs>? _dependsOn;
        public InputList<Inputs.TaskDefinitionContainerDependencyArgs> DependsOn
        {
            get => _dependsOn ?? (_dependsOn = new InputList<Inputs.TaskDefinitionContainerDependencyArgs>());
            set => _dependsOn = value;
        }

        [Input("disableNetworking")]
        public Input<bool>? DisableNetworking { get; set; }

        [Input("dnsSearchDomains")]
        private InputList<string>? _dnsSearchDomains;
        public InputList<string> DnsSearchDomains
        {
            get => _dnsSearchDomains ?? (_dnsSearchDomains = new InputList<string>());
            set => _dnsSearchDomains = value;
        }

        [Input("dnsServers")]
        private InputList<string>? _dnsServers;
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dockerLabels")]
        public Input<object>? DockerLabels { get; set; }

        [Input("dockerSecurityOptions")]
        private InputList<string>? _dockerSecurityOptions;
        public InputList<string> DockerSecurityOptions
        {
            get => _dockerSecurityOptions ?? (_dockerSecurityOptions = new InputList<string>());
            set => _dockerSecurityOptions = value;
        }

        [Input("entryPoint")]
        private InputList<string>? _entryPoint;
        public InputList<string> EntryPoint
        {
            get => _entryPoint ?? (_entryPoint = new InputList<string>());
            set => _entryPoint = value;
        }

        [Input("environment")]
        private InputList<Inputs.TaskDefinitionKeyValuePairArgs>? _environment;

        /// <summary>
        /// The environment variables to pass to a container
        /// </summary>
        public InputList<Inputs.TaskDefinitionKeyValuePairArgs> Environment
        {
            get => _environment ?? (_environment = new InputList<Inputs.TaskDefinitionKeyValuePairArgs>());
            set => _environment = value;
        }

        [Input("environmentFiles")]
        private InputList<Inputs.TaskDefinitionEnvironmentFileArgs>? _environmentFiles;

        /// <summary>
        /// The list of one or more files that contain the environment variables to pass to a container
        /// </summary>
        public InputList<Inputs.TaskDefinitionEnvironmentFileArgs> EnvironmentFiles
        {
            get => _environmentFiles ?? (_environmentFiles = new InputList<Inputs.TaskDefinitionEnvironmentFileArgs>());
            set => _environmentFiles = value;
        }

        [Input("essential")]
        public Input<bool>? Essential { get; set; }

        [Input("extraHosts")]
        private InputList<Inputs.TaskDefinitionHostEntryArgs>? _extraHosts;
        public InputList<Inputs.TaskDefinitionHostEntryArgs> ExtraHosts
        {
            get => _extraHosts ?? (_extraHosts = new InputList<Inputs.TaskDefinitionHostEntryArgs>());
            set => _extraHosts = value;
        }

        [Input("firelensConfiguration")]
        public Input<Inputs.TaskDefinitionFirelensConfigurationArgs>? FirelensConfiguration { get; set; }

        [Input("healthCheck")]
        public Input<Inputs.TaskDefinitionHealthCheckArgs>? HealthCheck { get; set; }

        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The image used to start a container. This string is passed directly to the Docker daemon.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("interactive")]
        public Input<bool>? Interactive { get; set; }

        [Input("links")]
        private InputList<string>? _links;
        public InputList<string> Links
        {
            get => _links ?? (_links = new InputList<string>());
            set => _links = value;
        }

        [Input("linuxParameters")]
        public Input<Inputs.TaskDefinitionLinuxParametersArgs>? LinuxParameters { get; set; }

        [Input("logConfiguration")]
        public Input<Inputs.TaskDefinitionLogConfigurationArgs>? LogConfiguration { get; set; }

        /// <summary>
        /// The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed.
        /// </summary>
        [Input("memory")]
        public Input<int>? Memory { get; set; }

        [Input("memoryReservation")]
        public Input<int>? MemoryReservation { get; set; }

        [Input("mountPoints")]
        private InputList<Inputs.TaskDefinitionMountPointArgs>? _mountPoints;
        public InputList<Inputs.TaskDefinitionMountPointArgs> MountPoints
        {
            get => _mountPoints ?? (_mountPoints = new InputList<Inputs.TaskDefinitionMountPointArgs>());
            set => _mountPoints = value;
        }

        /// <summary>
        /// The name of a container. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("portMappings")]
        private InputList<Inputs.TaskDefinitionPortMappingArgs>? _portMappings;

        /// <summary>
        /// Port mappings allow containers to access ports on the host container instance to send or receive traffic.
        /// </summary>
        public InputList<Inputs.TaskDefinitionPortMappingArgs> PortMappings
        {
            get => _portMappings ?? (_portMappings = new InputList<Inputs.TaskDefinitionPortMappingArgs>());
            set => _portMappings = value;
        }

        [Input("privileged")]
        public Input<bool>? Privileged { get; set; }

        [Input("pseudoTerminal")]
        public Input<bool>? PseudoTerminal { get; set; }

        [Input("readonlyRootFilesystem")]
        public Input<bool>? ReadonlyRootFilesystem { get; set; }

        [Input("repositoryCredentials")]
        public Input<Inputs.TaskDefinitionRepositoryCredentialsArgs>? RepositoryCredentials { get; set; }

        [Input("resourceRequirements")]
        private InputList<Inputs.TaskDefinitionResourceRequirementArgs>? _resourceRequirements;
        public InputList<Inputs.TaskDefinitionResourceRequirementArgs> ResourceRequirements
        {
            get => _resourceRequirements ?? (_resourceRequirements = new InputList<Inputs.TaskDefinitionResourceRequirementArgs>());
            set => _resourceRequirements = value;
        }

        [Input("secrets")]
        private InputList<Inputs.TaskDefinitionSecretArgs>? _secrets;
        public InputList<Inputs.TaskDefinitionSecretArgs> Secrets
        {
            get => _secrets ?? (_secrets = new InputList<Inputs.TaskDefinitionSecretArgs>());
            set => _secrets = value;
        }

        [Input("startTimeout")]
        public Input<int>? StartTimeout { get; set; }

        [Input("stopTimeout")]
        public Input<int>? StopTimeout { get; set; }

        [Input("systemControls")]
        private InputList<Inputs.TaskDefinitionSystemControlArgs>? _systemControls;
        public InputList<Inputs.TaskDefinitionSystemControlArgs> SystemControls
        {
            get => _systemControls ?? (_systemControls = new InputList<Inputs.TaskDefinitionSystemControlArgs>());
            set => _systemControls = value;
        }

        [Input("ulimits")]
        private InputList<Inputs.TaskDefinitionUlimitArgs>? _ulimits;
        public InputList<Inputs.TaskDefinitionUlimitArgs> Ulimits
        {
            get => _ulimits ?? (_ulimits = new InputList<Inputs.TaskDefinitionUlimitArgs>());
            set => _ulimits = value;
        }

        [Input("user")]
        public Input<string>? User { get; set; }

        [Input("volumesFrom")]
        private InputList<Inputs.TaskDefinitionVolumeFromArgs>? _volumesFrom;
        public InputList<Inputs.TaskDefinitionVolumeFromArgs> VolumesFrom
        {
            get => _volumesFrom ?? (_volumesFrom = new InputList<Inputs.TaskDefinitionVolumeFromArgs>());
            set => _volumesFrom = value;
        }

        [Input("workingDirectory")]
        public Input<string>? WorkingDirectory { get; set; }

        public TaskDefinitionContainerDefinitionArgs()
        {
        }
        public static new TaskDefinitionContainerDefinitionArgs Empty => new TaskDefinitionContainerDefinitionArgs();
    }
}
