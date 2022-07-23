// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionRepositoryCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionRepositoryCredentialsArgs Empty = new TaskDefinitionRepositoryCredentialsArgs();

    @Import(name="credentialsParameter")
    private @Nullable Output<String> credentialsParameter;

    public Optional<Output<String>> credentialsParameter() {
        return Optional.ofNullable(this.credentialsParameter);
    }

    private TaskDefinitionRepositoryCredentialsArgs() {}

    private TaskDefinitionRepositoryCredentialsArgs(TaskDefinitionRepositoryCredentialsArgs $) {
        this.credentialsParameter = $.credentialsParameter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionRepositoryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionRepositoryCredentialsArgs $;

        public Builder() {
            $ = new TaskDefinitionRepositoryCredentialsArgs();
        }

        public Builder(TaskDefinitionRepositoryCredentialsArgs defaults) {
            $ = new TaskDefinitionRepositoryCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentialsParameter(@Nullable Output<String> credentialsParameter) {
            $.credentialsParameter = credentialsParameter;
            return this;
        }

        public Builder credentialsParameter(String credentialsParameter) {
            return credentialsParameter(Output.of(credentialsParameter));
        }

        public TaskDefinitionRepositoryCredentialsArgs build() {
            return $;
        }
    }

}